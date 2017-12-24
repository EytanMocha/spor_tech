package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import entity.Game;

import manager.ManagerHelper;

@Path("/Game")
public class GameService {

	public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sportech");

	public static EntityManager entityManager = entityManagerFactory.createEntityManager();

	@GET
	@Path("get")
	public Game getGame(@QueryParam("id") int id) {
		return (Game) ManagerHelper.getGameManger().get(id);
	}
}
