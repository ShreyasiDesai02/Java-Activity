package Treemap;

public class Player {
	private String name;
	private String team;
	private String skill;
	public Player(String name, String team, String skill) {
		super();
		this.name = name;
		this.team = team;
		this.skill = skill;
	}
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "" + name + "--" + team + "--" + skill + "";
	}
	
	
	
}
