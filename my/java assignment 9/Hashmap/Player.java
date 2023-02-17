package Hashmap;
public class Player {
	private String bowlerName;
	private int wicketCount;
	
	public Player(String bowlerName, int wicketCount) {
		super();
		this.bowlerName = bowlerName;
		this.wicketCount = wicketCount;
	}
	public String getBowlerName() {
		return bowlerName;
	}
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}
	public int getWicketCount() {
		return wicketCount;
	}
	public void setWicketCount(int wicketCount) {
		this.wicketCount = wicketCount;
	}
	
	@Override
	public String toString() {
		return "bowlerName: " + bowlerName + "\nwicketCount: " + wicketCount;
	}
	
	
}