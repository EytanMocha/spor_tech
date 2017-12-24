package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


import entity.League_table;
import manager.ManagerHelper;
@Path("/League_table")
public class League_tableService {
			public static EntityManagerFactory entityManagerFactory=
					Persistence.createEntityManagerFactory("sportech");
			
			public static EntityManager entityManager=
					entityManagerFactory.createEntityManager();
			
			@GET
			@Path("get")
			public League_table getLeague_table(@QueryParam("id") int id){
				return (League_table)ManagerHelper.getLeague_tableManager().get(id); 
			}
}
