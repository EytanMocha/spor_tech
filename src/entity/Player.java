package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastname;
	private int age;

	private int yellow;
	private int red;
	
	@JoinColumn(name = "team")
	private Team team;

	public Player() {

	}

	public Player(int id, String firstname, String lastname, int age, int yellow, int red, Team team) {

		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.yellow = yellow;
		this.red = red;
		this.team = team;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYellow() {
		return yellow;
	}

	public void setYellow(int yellow) {
		this.yellow = yellow;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
