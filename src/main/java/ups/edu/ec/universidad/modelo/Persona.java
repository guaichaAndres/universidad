package ups.edu.ec.universidad.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Persona {
	@Id
	private String codigo;
	private String dni;
	private String nombre;
	private String email;
	private String direccion;
	@OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
	private List <Titulo> nombreTitulo;
	public List<Titulo> getNombreTitulo() {
		return nombreTitulo;
	}
	public void setNombreTitulo(List<Titulo> nombreTitulo) {
		this.nombreTitulo = nombreTitulo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", dni=" + dni + ", nombre=" + nombre + ", email=" + email + ", direccion="
				+ direccion + ", nombreTitulo=" + nombreTitulo + "]";
	}

	
}
