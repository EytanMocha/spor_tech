package manager;

import javax.persistence.EntityManager;

import org.apache.openjpa.persistence.EntityManagerImpl;

import entity.Goal;


public class GoalManager {
	private final EntityManager entityManager;

	public GoalManager(EntityManager entityManager) {
		this.entityManager = entityManager;
		((EntityManagerImpl) this.entityManager).getBroker().setAllowReferenceToSiblingContext(true);
	}

	public void update(Goal goal) {
		entityManager.getTransaction().begin();
		entityManager.merge(goal);
		entityManager.getTransaction().commit();
	}

	public void create(Goal goal) {
		entityManager.getTransaction().begin();
		entityManager.persist(goal);
		entityManager.getTransaction().commit();
	}

	public void delete(Goal goal) {
		entityManager.getTransaction().begin();
		entityManager.remove(goal);
		entityManager.getTransaction().commit();
	}

	public Goal get(int id) {
		return entityManager.find(Goal.class, id);
	}

}
