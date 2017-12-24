package manager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManagerHelper {

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sportech");

	public static PlayerManager getPlayerManager() {

		return new PlayerManager(entityManagerFactory.createEntityManager());

	}
	public static TeamManager getTeamManager() {
		
		return new TeamManager(entityManagerFactory.createEntityManager());
		
	}
	public static CityManger getCityManger() {
		
		return new CityManger(entityManagerFactory.createEntityManager());
		
	}
	public static GameManger getGameManger() {
		
		return new GameManger(entityManagerFactory.createEntityManager());
		
	}
	public static GoalManager getGoalManager() {
		
		return new GoalManager(entityManagerFactory.createEntityManager());
		
	}
	public static League_tableManager getLeague_tableManager() {
		
		return new League_tableManager(entityManagerFactory.createEntityManager());
		
	}
	public static LeagueManager getLeagueManager() {
		
		return new LeagueManager(entityManagerFactory.createEntityManager());
		
	}
	public static StadiumManager getStadiumManager() {
		
		return new StadiumManager(entityManagerFactory.createEntityManager());
		
	}

	

}