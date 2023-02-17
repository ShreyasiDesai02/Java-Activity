package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Player> hm = new HashMap<String, Player>();
		
		String temp = "yes";
		
		while (temp.equalsIgnoreCase("yes")) {
			System.out.println("Enter the player name:");
			String bowlerName = sc.next();
			sc.nextLine();
			System.out.println("Enter wickets - seperated by \"|\" symbol.");
			int wicketCount = sc.nextLine().split("\\|").length;
			
			System.out.println("Do you want to add another player (yes/no)");
			temp = sc.next();
			
			Player pl = new Player(bowlerName, wicketCount);
			
			hm.put(bowlerName, pl);
			
		}
		
		temp = "yes";
		while (temp.equalsIgnoreCase("yes")) {
			System.out.println("Enter the player name to search:");
			String bowler = sc.next();
			
			if(hm.containsKey(bowler)) {
				System.out.println(hm.get(bowler));
			}
			else {
				System.out.println("No player found with the name "+bowler);
			}
			
			System.out.println("Do you want to search another player (yes/no)");
			temp = sc.next();
		}
		

	}

}
