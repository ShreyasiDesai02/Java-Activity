package Sort_team_player;

public class Player implements Comparable<Player> {
	private String name;

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Player other) {
		return this.name.compareToIgnoreCase(other.getName());
	}
	
}