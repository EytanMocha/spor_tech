package manager;

import javax.persistence.EntityManager;

import org.apache.openjpa.persistence.EntityManagerImpl;

import entity.Stadium;


public class StadiumManager {
	private final EntityManager entityManager;

	public StadiumManager(EntityManager entityManager) {
		this.entityManager = entityManager;
		((EntityManagerImpl) this.entityManager).getBroker().setAllowReferenceToSiblingContext(true);
	}

	public void update(Stadium stadium) {
		entityManager.getTransaction().begin();
		entityManager.merge(stadium);
		entityManager.getTransaction().commit();
	}

	public void create(Stadium stadium) {
		entityManager.getTransaction().begin();
		entityManager.persist(stadium);
		entityManager.getTransaction().commit();
	}

	public void delete(Stadium stadium) {
		entityManager.getTransaction().begin();
		entityManager.remove(stadium);
		entityManager.getTransaction().commit();
	}

	public Stadium get(int id) {
		return entityManager.find(Stadium.class, id);
	}

	


}


