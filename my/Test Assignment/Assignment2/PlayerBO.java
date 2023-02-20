package Assignment2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PlayerBO {
	public List<Player> findPlayer(List<Player> playerList, String nationality){
		
		List<Player> playerByNationality = new ArrayList<>();
		for (Player player : playerList) {
			if(player.getNationality().equalsIgnoreCase(nationality)) {
				playerByNationality.add(player);
			}
		}
				
		return playerByNationality;
	}
	
	public List<Player> findPlayer(List<Player> playerList,	LocalDate dateOfBirth){
		
		List<Player> playerByDOB = new ArrayList<>();
		for (Player player : playerList) {
			if(player.getDateOfBirth().equals(dateOfBirth)) {
				playerByDOB.add(player);
			}
		}
				
		return playerByDOB;
	}
	
	public List<Player> findPlayer(List<Player> playerList,	Double powerRating){
		
		List<Player> playerByRating = new ArrayList<>();
		for (Player player : playerList) {
			if(player.getPowerRating().equals(powerRating)) {
				playerByRating.add(player);
			}
		}
				
		return playerByRating;
	}
}

