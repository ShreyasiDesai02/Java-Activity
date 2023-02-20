package Assignment1;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Team extends Player{
	
	public Team(
			String name, LocalDate dob, String skill, int no_match, int runs, int wickets, String nationality,
			Double powerRating, String Pname,List<Player> playerList ) { 
		super(name, dob, skill, no_match, runs, wickets, nationality, powerRating);
	
		this.Pname = Pname;
		this.playerList = playerList;
		
		
	}
	
	public Team() {
		super();
	}

	private String Pname;
	private List<Player> playerList;
	// ArrayList<Player> players;
	//public Object addPlayerToTeam;
	

	
	public String getName() {
		return Pname;
	}
	
	public void setName(String name) {
		this.Pname = name;
	}
	
	public List<Player> getPlayerList() {
		return playerList;
	}
	
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
	 public Team(String name,List<Player> playersList) {
	        this.Pname = name;
	        this.playerList = new ArrayList<Player>();
	    }
	 
	 public void addPlayerToTeam(Player player) {
	       playerList.add(player);
	        System.out.println("Player successfully added.");
	    }

	    public Boolean removePlayerFromTeam(String name) {
	        for (Player player : playerList) {
	            if (player.getName().equals(name)) {
	                this.playerList.remove(player);
	                System.out.println("Player successfully deleted.");
	                return true;
	            }

	       }
	        System.out.println("Player not found in the team.");
	        return false;
}
	    public void displayPlayers() {
	        if (this.playerList.size() == 0) {
	            System.out.println("No players to show.");
	        } else {
	            System.out.println("Players in " + this.Pname);
	            System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name","Date of birth","Skill","No of matches","Runs","Wickets","Nationality","Rating");
	            for (Player player : playerList) {
	                System.out.printf("%-15s%-15s%-10s%-15d%-10d%-10d%-15s%-10.1f\n", player.getName(), player.getDob(),
	                        player.getSkill(), player.getNo_match(), player.getRuns(), player.getWickets(),
	                        player.getNationality(), player.getPowerRating());
	            }
	        }
	    }

	
	    
	    
}
