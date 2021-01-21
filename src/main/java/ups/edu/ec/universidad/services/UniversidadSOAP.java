package ups.edu.ec.universidad.services;

import java.util.Date;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ups.edu.ec.universidad.modelo.Persona;
import ups.edu.ec.universidad.modelo.Titulo;
import ups.edu.ec.universidad.negocio.GestionTituloON;

@WebService

public class UniversidadSOAP {
	@Inject
	private GestionTituloON tituloON;
	@WebMethod
	public void registrarTitulo(String dni, String nombre, String universidad) {
		try {
			Titulo ti = new Titulo();
			Persona per = tituloON.buscarPersona(dni);
			if (per == null) {
				
				System.out.println("PErsona no encontrada");
				
			}else if (per.getDni().length() < 10 || per.getDni().length() > 10) {
				
				System.out.println("DNI incorrecto, el tamaño debe ser de 10!!!");
				
			}else {
				
				ti.setCodigo(tituloON.alfaNum());
				ti.setNombre(nombre);
				ti.setUniversidad(universidad);
				ti.setFechaRegistro(new Date());
				ti.setPersona(per);

				tituloON.crearTitulo(ti);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
