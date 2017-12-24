package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class League {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String league;

public League() {

}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getLeague() {
	return league;
}

public void setLeague(String league) {
	this.league = league;
}

public League(int id, String league) {

	this.id = id;
	this.league = league;
}
}
