package Example1;

public class Player {
	private String name;
	private String Skill;
	
	public Player(String name, String skill) {
		this.Skill = skill;
		this.name = name;
	
	}
	
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", Skill=" + Skill + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
		
		
	}
}
