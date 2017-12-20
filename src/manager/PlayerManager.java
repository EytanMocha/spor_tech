package manager;

import java.util.List;

import javax.persistence.EntityManager;

import org.apache.openjpa.persistence.EntityManagerImpl;


import entity.Player;



public class PlayerManager {

	private final EntityManager entityManager;

	public PlayerManager(EntityManager entityManager) {
		this.entityManager = entityManager;
		((EntityManagerImpl) this.entityManager).getBroker().setAllowReferenceToSiblingContext(true);
	}

	public void update(Player player) {
		entityManager.getTransaction().begin();
		entityManager.merge(player);
		entityManager.getTransaction().commit();
	}

	public void create(Player player) {
		entityManager.getTransaction().begin();
		entityManager.persist(player);
		entityManager.getTransaction().commit();
	}

	public void delete(Player player) {
		entityManager.getTransaction().begin();
		entityManager.remove(player);
		entityManager.getTransaction().commit();
	}

	public Player get(int id) {
		return entityManager.find(Player.class, id);
	}

	


}