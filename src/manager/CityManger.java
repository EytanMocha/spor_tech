package manager;

import javax.persistence.EntityManager;

import org.apache.openjpa.persistence.EntityManagerImpl;

import entity.City;


public class CityManger {
	private final EntityManager entityManager;

	public CityManger(EntityManager entityManager) {
		this.entityManager = entityManager;
		((EntityManagerImpl) this.entityManager).getBroker().setAllowReferenceToSiblingContext(true);
	}

	public void update(City city) {
		entityManager.getTransaction().begin();
		entityManager.merge(city);
		entityManager.getTransaction().commit();
	}

	public void create(City city) {
		entityManager.getTransaction().begin();
		entityManager.persist(city);
		entityManager.getTransaction().commit();
	}

	public void delete(City city) {
		entityManager.getTransaction().begin();
		entityManager.remove(city);
		entityManager.getTransaction().commit();
	}

	public City get(int id) {
		return entityManager.find(City.class, id);
	}
}
