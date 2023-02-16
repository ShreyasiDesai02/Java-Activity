package Example1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class PlayerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Player> p = new ArrayList<Player>();
		String Skill = null;
		System.out.println("Enter the number of players to be registered:");
		int n = sc.nextInt();sc.nextLine();
		
		for(int i=0; i<n;i++) {
			System.out.println("Please enter the player name:");
			String name = sc.nextLine();
			
			System.out.println("Please select the skill of the player\r\n"
					+ "1.All Rounder\r\n"
					+ "2.Batsman\r\n"
					+ "3.Bowler");
			int choice = sc.nextInt();sc.nextLine();
			
			if(choice==1) {
				Skill = "All rounder";
			}
			else if(choice==2) {
				Skill = "Batsman";
			}
			else if(choice == 3) {
				Skill = "Bowler";
			}
			else {
				System.out.println("Invalid Input");
				return;
			}

			
			Player player = new Player(name,Skill);
			p.add(player);
			
			
		}
		Collections.sort(p,new PlayerComparator());
		
		for(Object a : p) {
			System.out.println(a);
		}
		

	}

}
