package Treemap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeMap<Integer, Player> tm = new TreeMap<>();
		
		System.out.println("Enter the number of players:");
		int n = sc.nextInt();
		Player p = new Player();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the details of the player "+(i+1));
			
			int capNo = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String team = sc.nextLine();
			String skill = sc.nextLine();
			
			p = new Player(name, team, skill);
			
			tm.put(capNo, p);
			
			
		}

		System.out.println("Player Details:");
		for(Map.Entry<Integer, Player> i : tm.entrySet()) {
			System.out.println(i);
		}
	}

}