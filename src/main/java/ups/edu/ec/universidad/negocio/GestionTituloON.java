package ups.edu.ec.universidad.negocio;

import java.util.Random;

import javax.ejb.Stateless;
import javax.inject.Inject;
import ups.edu.ec.universidad.dao.PersonaDAO;
import ups.edu.ec.universidad.dao.TituloDAO;
import ups.edu.ec.universidad.modelo.Persona;
import ups.edu.ec.universidad.modelo.Titulo;

@Stateless
public class GestionTituloON {
	@Inject
	private TituloDAO daoTitulo;
	@Inject
	private PersonaDAO daoPersona;
	
	public String alfaNum() {
		String a;
		int n;
		String c = "COD00";
		Random r = new Random();
		n = r.nextInt();
		a = c + String.valueOf(n);
		return a;
	}
	
	public boolean crearTitulo(Titulo titulo) throws Exception {
		try {
			daoTitulo.crear(titulo);
			return true;
		}catch(Exception e) {
			System.out.println("OK");
			e.printStackTrace();
			return false;
		}
	}
	
	
	

	
	public Persona buscarPersona(String dni) throws Exception{ 
		try {
			return daoPersona.buscar(dni);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
