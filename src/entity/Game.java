package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int team_A;
	private int team_b;
	private String date;
	@ManyToOne
	@JoinColumn(name = "stadium")
	private Stadium stadium;
	private int score_A;
	private int score_B;
	public Game(int id, int team_A, int team_b, String date, Stadium stadium, int score_A, int score_B) {

		this.id = id;
		this.team_A = team_A;
		this.team_b = team_b;
		this.date = date;
		this.stadium = stadium;
		this.score_A = score_A;
		this.score_B = score_B;
	}
	public  Game() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTeam_A() {
		return team_A;
	}
	public void setTeam_A(int team_A) {
		this.team_A = team_A;
	}
	public int getTeam_b() {
		return team_b;
	}
	public void setTeam_b(int team_b) {
		this.team_b = team_b;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Stadium getStadium() {
		return stadium;
	}
	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}
	public int getScore_A() {
		return score_A;
	}
	public void setScore_A(int score_A) {
		this.score_A = score_A;
	}
	public int getScore_B() {
		return score_B;
	}
	public void setScore_B(int score_B) {
		this.score_B = score_B;
	}
	
}
