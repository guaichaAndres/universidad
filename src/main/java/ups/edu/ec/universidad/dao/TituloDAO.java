package ups.edu.ec.universidad.dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ups.edu.ec.universidad.modelo.Titulo;

@Stateless

public class TituloDAO {
	@Inject
	private EntityManager em;
	
	
public TituloDAO() {
		
	}
	


	public boolean crear(Titulo ti) {
		try {
			em.persist(ti);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
