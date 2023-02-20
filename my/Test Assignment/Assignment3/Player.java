package Assignment3;

import java.time.LocalDate;

public class Player implements Comparable<Player>{
	private String name;
	private LocalDate dateOfBirth;
	private String skill;
	private Integer numberOfMatches;
	private Integer runs;
	private Integer wickets;
	private String nationality;
	private Double powerRating;
	public Player() {
		super();
	}
	public Player(String name, LocalDate dateOfBirth, String skill, Integer numberOfMatches, Integer runs,
			Integer wickets, String nationality, Double powerRating) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public Integer getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(Integer numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public Integer getRuns() {
		return runs;
	}
	public void setRuns(Integer runs) {
		this.runs = runs;
	}
	public Integer getWickets() {
		return wickets;
	}
	public void setWickets(Integer wickets) {
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
        LocalDate dateOfBirth = LocalDate.parse(details[1]);
        String skill = details[2];
        Integer numberOfMatches = Integer.parseInt(details[3]);
        Integer runs = Integer.parseInt(details[4]);
        Integer wickets = Integer.parseInt(details[5]);
        String nationality = details[6];
        Double powerRating = Double.parseDouble(details[7]);
		
		Player player = new Player(name, dateOfBirth, skill, numberOfMatches, runs, wickets, nationality, powerRating);
		
		return player;
		
	}
	@Override
	public int compareTo(Player p) {
		return Integer.compare(this.numberOfMatches, p.numberOfMatches);
	}
	
	
}