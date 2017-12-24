package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import entity.Goal;

import manager.ManagerHelper;
@Path("/goal")
public class GoalService {



				public static EntityManagerFactory entityManagerFactory=
						Persistence.createEntityManagerFactory("sportech");
				
				public static EntityManager entityManager=
						entityManagerFactory.createEntityManager();
				
				@GET
				@Path("get")
				public Goal getGoal(@QueryParam("id") int id){
					return (Goal)ManagerHelper.getGoalManager().get(id); 
				}
}
