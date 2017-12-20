package entity;

public class Players {
	private int id;
	 private String firstName;
	 private String lastName;
	 private int age;
	 private int apearences;
	 private int cockes;
	 private int yellowFlags;
	 private int redFlag;
	 private int team;
	 
	 public Players(){
		 
	 }
	 
	public Players(int id, String firstName, String lastName, int age, int apearences, int cockes, int yellowFlags,
			int redFlag, int team) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.apearences = apearences;
		this.cockes = cockes;
		this.yellowFlags = yellowFlags;
		this.redFlag = redFlag;
		this.team = team;
	}
	public Players(String firstName, String lastName, int age, int apearences, int cockes, int yellowFlags, int redFlag,
			int team) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.apearences = apearences;
		this.cockes = cockes;
		this.yellowFlags = yellowFlags;
		this.redFlag = redFlag;
		this.team = team;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getApearences() {
		return apearences;
	}
	public void setApearences(int apearences) {
		this.apearences = apearences;
	}
	public int getCockes() {
		return cockes;
	}
	public void setCockes(int cockes) {
		this.cockes = cockes;
	}
	public int getYellowFlags() {
		return yellowFlags;
	}
	public void setYellowFlags(int yellowFlags) {
		this.yellowFlags = yellowFlags;
	}
	public int getRedFlag() {
		return redFlag;
	}
	public void setRedFlag(int redFlag) {
		this.redFlag = redFlag;
	}
	public int getTeam() {
		return team;
	}
	public void setTeam(int team) {
		this.team = team;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	 

}
