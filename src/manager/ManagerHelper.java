package manager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManagerHelper {

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("spor_tech");

	public static PlayerManager getPlayerManager() {

		return new PlayerManager(entityManagerFactory.createEntityManager());

	}
	public static TeamManager getTeamManager() {
		
		return new TeamManager(entityManagerFactory.createEntityManager());
		
	}

	

}