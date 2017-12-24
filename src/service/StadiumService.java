package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import entity.Stadium;

import manager.ManagerHelper;
@Path("/Stadium")
public class StadiumService {

	public static EntityManagerFactory entityManagerFactory=
			Persistence.createEntityManagerFactory("sportech");
	
	public static EntityManager entityManager=
			entityManagerFactory.createEntityManager();
	
	@GET
	@Path("get")
	public Stadium getStadium(@QueryParam("id") int id){
		return (Stadium)ManagerHelper.getStadiumManager().get(id); 
	}
}
