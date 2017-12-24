package manager;

import javax.persistence.EntityManager;

import org.apache.openjpa.persistence.EntityManagerImpl;

import entity.Game;


public class GameManger {
	private final EntityManager entityManager;

	public GameManger(EntityManager entityManager) {
		this.entityManager = entityManager;
		((EntityManagerImpl) this.entityManager).getBroker().setAllowReferenceToSiblingContext(true);
	}

	public void update(Game game) {
		entityManager.getTransaction().begin();
		entityManager.merge(game);
		entityManager.getTransaction().commit();
	}

	public void create(Game game) {
		entityManager.getTransaction().begin();
		entityManager.persist(game);
		entityManager.getTransaction().commit();
	}

	public void delete(Game game) {
		entityManager.getTransaction().begin();
		entityManager.remove(game);
		entityManager.getTransaction().commit();
	}

	public Game get(int id) {
		return entityManager.find(Game.class, id);
	}

}
