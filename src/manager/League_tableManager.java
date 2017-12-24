package manager;

import javax.persistence.EntityManager;

import org.apache.openjpa.persistence.EntityManagerImpl;

import entity.League_table;


public class League_tableManager {
	private final EntityManager entityManager;

	public League_tableManager(EntityManager entityManager) {
		this.entityManager = entityManager;
		((EntityManagerImpl) this.entityManager).getBroker().setAllowReferenceToSiblingContext(true);
	}

	public void update(League_table lt) {
		entityManager.getTransaction().begin();
		entityManager.merge(lt);
		entityManager.getTransaction().commit();
	}

	public void create(League_table lt) {
		entityManager.getTransaction().begin();
		entityManager.persist(lt);
		entityManager.getTransaction().commit();
	}

	public void delete(League_table lt) {
		entityManager.getTransaction().begin();
		entityManager.remove(lt);
		entityManager.getTransaction().commit();
	}

	public League_table get(int id) {
		return entityManager.find(League_table.class, id);
	}

}
