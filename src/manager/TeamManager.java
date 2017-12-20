package manager;



	import javax.persistence.EntityManager;

	import org.apache.openjpa.persistence.EntityManagerImpl;


	
import entity.Team;



	public class TeamManager {

		private final EntityManager entityManager;

		public TeamManager(EntityManager entityManager) {
			this.entityManager = entityManager;
			((EntityManagerImpl) this.entityManager).getBroker().setAllowReferenceToSiblingContext(true);
		}

		public void update(Team team) {
			entityManager.getTransaction().begin();
			entityManager.merge(team);
			entityManager.getTransaction().commit();
		}

		public void create(Team team) {
			entityManager.getTransaction().begin();
			entityManager.persist(team);
			entityManager.getTransaction().commit();
		}

		public void delete(Team team) {
			entityManager.getTransaction().begin();
			entityManager.remove(team);
			entityManager.getTransaction().commit();
		}

		public Team get(int id) {
			return entityManager.find(Team.class, id);
		}

		


	}

