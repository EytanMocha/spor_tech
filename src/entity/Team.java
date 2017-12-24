package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Team{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToOne
	@JoinColumn(name="city")
	private City city;
	@ManyToOne
	@JoinColumn(name="league")
	private League league;

	private String coach;
	private String team_Administrator;
	private int points;
	private int score;
	private int lose;
	
	public Team(){
		
	}

	public Team(int id, String name, City city, League league, String coach, String team_Administrator, int points,
			int score, int lose) {
	
		this.id = id;
		this.name = name;
		this.city = city;
		this.league = league;
		this.coach = coach;
		this.team_Administrator = team_Administrator;
		this.points = points;
		this.score = score;
		this.lose = lose;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public String getTeam_Administrator() {
		return team_Administrator;
	}

	public void setTeam_Administrator(String team_Administrator) {
		this.team_Administrator = team_Administrator;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	
}
