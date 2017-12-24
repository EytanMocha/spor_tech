package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import entity.League;

import manager.ManagerHelper;
@Path("/League")
public class LeagueService {

	


		public static EntityManagerFactory entityManagerFactory=
				Persistence.createEntityManagerFactory("sportech");
		
		public static EntityManager entityManager=
				entityManagerFactory.createEntityManager();
		
		@GET
		@Path("get")
		public League getLeague(@QueryParam("id") int id){
			return (League)ManagerHelper.getLeagueManager().get(id); 
		}
}
