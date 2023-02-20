package Assignment1;

import java.time.LocalDate;
import java.util.*;
import Assignment1.Team;

public class Main {

	public static int main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the team name: ");
		String Name = sc.nextLine();
		System.out.println("1.Add Player\r\n "
				+ "2.Delete Player\r\n "
				+ "3.Display Players\r\n "
				+ "4.Exit");
		
		
		System.out.println("Enter the choice:");
		int ch = sc.nextInt(); sc.nextLine();
		
		Team t = new Team(name, dob, skill, no_match, runs, wickets, nationality, powerRating, Pname, playerList);
		
		if(ch ==1) {
			System.out.println("Enter the details of player in CSV format: ");
			String details = sc.nextLine();


			t.addPlayerToTeam();
			
		}
		
		else if(ch == 2) {
			System.out.println("Enter the player name to be deleted: ");
			String name = sc.nextLine();
			
			t.removePlayerFromTeam(name);
		}
		
		else if(ch == 3) {
			System.out.println("Player in : "+ Name );
			
			t.displayPlayers();
		}
		else if(ch == 4){
			return 0;
		}
		else {
			System.out.println("Inavlid Input");
		}
		

}

}
