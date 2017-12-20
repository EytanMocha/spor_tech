package entity;

public class Team{
	
	private int id;
	private String teamName;
	private String cityName;
	private String ligue;
	private int palyers;
	private String coach;
	private String manager;
	private String points;
	private String score;
	private String loses;
	
	public Team(){
		
	}
	
	public Team(String teamName, String cityName, String ligue, int palyers, String coach, String manager,
			String points, String score, String loses) {
		super();
		this.teamName = teamName;
		this.cityName = cityName;
		this.ligue = ligue;
		this.palyers = palyers;
		this.coach = coach;
		this.manager = manager;
		this.points = points;
		this.score = score;
		this.loses = loses;
	}


	public Team(int id, String teamName, String cityName, String ligue, int palyers, String coach, String manager,
			String points, String score, String loses) {
	
		this.id = id;
		this.teamName = teamName;
		this.cityName = cityName;
		this.ligue = ligue;
		this.palyers = palyers;
		this.coach = coach;
		this.manager = manager;
		this.points = points;
		this.score = score;
		this.loses = loses;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getLigue() {
		return ligue;
	}


	public void setLigue(String ligue) {
		this.ligue = ligue;
	}


	public int getPalyers() {
		return palyers;
	}


	public void setPalyers(int palyers) {
		this.palyers = palyers;
	}


	public String getCoach() {
		return coach;
	}


	public void setCoach(String coach) {
		this.coach = coach;
	}


	public String getManager() {
		return manager;
	}


	public void setManager(String manager) {
		this.manager = manager;
	}


	public String getPoints() {
		return points;
	}


	public void setPoints(String points) {
		this.points = points;
	}


	public String getScore() {
		return score;
	}


	public void setScore(String score) {
		this.score = score;
	}


	public String getLoses() {
		return loses;
	}


	public void setLoses(String loses) {
		this.loses = loses;
	}
	
	
	
	
}
