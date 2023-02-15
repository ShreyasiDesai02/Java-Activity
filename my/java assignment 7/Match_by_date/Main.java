package Match_by_date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number of matches");
			int m = sc.nextInt();
			sc.nextLine();
			
			TreeSet<Match> matches = new TreeSet<Match>();
			
			for(int i=0; i < m; i++) {
				System.out.println("Enter details for match-"+(i+1));
				 System.out.print("Enter match date in (yyyy-MM-dd)");
				LocalDate matchDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE);
				
				System.out.println("Enter Team 1");
				String team1 = sc.nextLine();
				
				System.out.println("Enter Team 2");
				String team2 = sc.nextLine();
				
				matches.add(new Match(matchDate, team1, team2));
			}
//			 Collections.sort(matches, Collections.reverseOrder());
			matches.descendingSet();
			 System.out.println("Match Detail");
		
			 	for(Match match: matches) {
			 		System.out.println("Match Held on "+ match.getMatchDate());
			 		System.out.println("Team 1 "+ match.getTeam1());
			 		System.out.println("Team 2 "+ match.getTeam2());
			 	}
		}
}

