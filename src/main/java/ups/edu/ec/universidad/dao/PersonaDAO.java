package ups.edu.ec.universidad.dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ups.edu.ec.universidad.modelo.Persona;

@Stateless
public class PersonaDAO {
	@Inject
	private EntityManager em;
	public Persona buscar (String cedula) {
		try {
			String jpql = "SELECT p FROM Persona p WHERE p.dni LIKE ?1";
			Query q = em.createQuery(jpql, Persona.class);
			q.setParameter(1, cedula);
			return (Persona)q.getSingleResult();
		}catch(Exception e) {
			return null;
		}
	}

}
