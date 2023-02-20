package Assignment1;

import java.time.LocalDate;


public class Player {
	
	
	public Player(String name, LocalDate dob, String skill, int no_match, int runs, int wickets, String nationality,
			Double powerRating) {
		super();
		this.name = name;
		this.dob = dob;
		this.skill = skill;
		this.no_match = no_match;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}
	public Player() {
		super();
	}
	private String name;
	private LocalDate dob;
	private String skill;
	private int no_match;
	private int runs;
	private int wickets;
	private String nationality;
	private Double powerRating;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNo_match() {
		return no_match;
	}
	public void setNo_match(int no_match) {
		this.no_match = no_match;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(Double powerRating) {
		this.powerRating = powerRating;
	}

	public static Player createPlayer(String detail) {
		String[] details = detail.split(",");
		
		String name = details[0];
		LocalDate dob = LocalDate.parse(details[1]);
        String skill = details[2];
		int no_match = Integer.parseInt(details[3]);
		int runs = Integer.parseInt(details[4]);
		int wickets = Integer.parseInt(details[5]);
		String nationality= details[6];
		Double powerRating =  Double.parseDouble(details[7]);
		
		Player player =new Player(name,dob,nationality,no_match,runs,wickets,nationality,powerRating);
		return player;
	}
	public String toString() {
		return "Player [name=" + name + ", dob=" + dob + ", skill=" + skill + ", no_match=" + no_match + ", runs="
				+ runs + ", wickets=" + wickets + ", nationality=" + nationality + ", powerRating=" + powerRating + "]";
	}
    }
	
	
	
