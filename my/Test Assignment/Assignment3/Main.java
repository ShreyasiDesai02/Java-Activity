package Assignment3;

import java.util.ArrayList;
import java.util.Collections;
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
		
		System.out.println("Enter a type to sort:\r\n"
				+ "1.Sort by number of matches played\r\n"
				+ "2.Sort by runs scored\r\n"
				+ "3.Sort by power rating");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			Collections.sort(playerList);
			System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-15s%10s\n","Name","Date of birth","Skill","No of matches","Runs","wickets","Nationality","Power rating");
			for (Player p : playerList) {
				System.out.printf("%-15s%-15s%-15s%-15d%-10d%-10d%-15s%-10.1f\n",
					    p.getName(),
					    p.getDateOfBirth(),
					    p.getSkill(),
					    p.getNumberOfMatches(),
					    p.getRuns(),
					    p.getWickets(),
					    p.getNationality(),
					    p.getPowerRating());
			}
			break;
		case 2:
			Collections.sort(playerList, new r());
			System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-15s%10s\n","Name","Date of birth","Skill","No of matches","Runs","wickets","Nationality","Power rating");
			for (Player p : playerList) {
				System.out.printf("%-15s%-15s%-15s%-15d%-10d%-10d%-15s%-10.1f\n",
					    p.getName(),
					    p.getDateOfBirth(),
					    p.getSkill(),
					    p.getNumberOfMatches(),
					    p.getRuns(),
					    p.getWickets(),
					    p.getNationality(),
					    p.getPowerRating());
			}
			break;
		case 3:
			Collections.sort(playerList, new p());
			System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-15s%10s\n","Name","Date of birth","Skill","No of matches","Runs","wickets","Nationality","Power rating");
			for (Player p : playerList) {
				System.out.printf("%-15s%-15s%-15s%-15d%-10d%-10d%-15s%-10.1f\n",
					    p.getName(),
					    p.getDateOfBirth(),
					    p.getSkill(),
					    p.getNumberOfMatches(),
					    p.getRuns(),
					    p.getWickets(),
					    p.getNationality(),
					    p.getPowerRating());
			}
			break;
		default:
			break;
		}

	}

}