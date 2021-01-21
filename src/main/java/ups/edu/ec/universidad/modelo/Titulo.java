package ups.edu.ec.universidad.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Titulo {
@Id
private String codigo;
private String nombre;
private String universidad;
private Date fechaRegistro;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="persona_id")
private Persona persona;
public Persona getPersona() {
	return persona;
}
public void setPersona(Persona persona) {
	this.persona = persona;
}
public String getNombre() {
	return nombre;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getUniversidad() {
	return universidad;
}
public void setUniversidad(String universidad) {
	this.universidad = universidad;
}
public Date getFechaRegistro() {
	return fechaRegistro;
}
public void setFechaRegistro(Date fechaRegistro) {
	this.fechaRegistro = fechaRegistro;
}
}
