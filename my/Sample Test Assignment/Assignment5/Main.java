package Assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of the players:");
		int n = sc.nextInt(); sc.nextLine();
		
		Player player = new Player();
		List<Player> playerList = new ArrayList<Player>();
		
		for (int i = 0; i < n; i++) {
			String details = sc.nextLine();
			
			player = Player.createPlayer(details);
			
			playerList.add(player);
		}

		String maxNationality = Player.highestCount(playerList);
		System.out.println("The nationality with maximum players: "+maxNationality);
	}

}
