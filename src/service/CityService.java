package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import entity.City;

import manager.ManagerHelper;
@Path("/City")
public class CityService {




	public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sportech");

	public static EntityManager entityManager = entityManagerFactory.createEntityManager();

	@GET
	@Path("get")
	public City getCity(@QueryParam("id") int id) {
		return (City) ManagerHelper.getCityManger().get(id);
	}
}
