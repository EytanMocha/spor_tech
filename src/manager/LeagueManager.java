package manager;

import javax.persistence.EntityManager;

import org.apache.openjpa.persistence.EntityManagerImpl;

import entity.League;


public class LeagueManager {
	private final EntityManager entityManager;

	public LeagueManager(EntityManager entityManager) {
		this.entityManager = entityManager;
		((EntityManagerImpl) this.entityManager).getBroker().setAllowReferenceToSiblingContext(true);
	}

	public void update(League league) {
		entityManager.getTransaction().begin();
		entityManager.merge(league);
		entityManager.getTransaction().commit();
	}

	public void create(League league) {
		entityManager.getTransaction().begin();
		entityManager.persist(league);
		entityManager.getTransaction().commit();
	}

	public void delete(League league) {
		entityManager.getTransaction().begin();
		entityManager.remove(league);
		entityManager.getTransaction().commit();
	}

	public League get(int id) {
		return entityManager.find(League.class, id);
	}

	

}
