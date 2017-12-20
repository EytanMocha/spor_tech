package service;




import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


import entity.Player;
import entity.Team;
import manager.ManagerHelper;

@Path("/team")
public class TeamService {
	
	public static EntityManagerFactory entityManagerFactory=
			Persistence.createEntityManagerFactory("spor_tech");
	
	public static EntityManager entityManager=
			entityManagerFactory.createEntityManager();
	
	@GET
	@Path("get")
	public Team getCustomer(@QueryParam("id") int id){
		return ManagerHelper.getTeamManager().get(id); 
	}
	
}
