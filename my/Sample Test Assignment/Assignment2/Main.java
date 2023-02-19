package Assignment2;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Players:");
		int n = sc.nextInt(); sc.nextLine();

		List<Player> playerList = new ArrayList<Player>();
		
		for (int i = 0; i < n; i++) {
			String[] details = sc.nextLine().split(",");

			String name = details[0];
			LocalDate dateOfBirth = LocalDate.parse(details[1]);
			String skill = details[2];
			Integer numberOfMatches = Integer.parseInt(details[3]);
			Integer runs = Integer.parseInt(details[4]);
			Integer wickets = Integer.parseInt(details[5]);
			String nationality = details[6];
			Double powerRating = Double.parseDouble(details[7]);
			
			Player player = new Player(name, dateOfBirth, skill, numberOfMatches, runs, wickets, nationality, powerRating);
			playerList.add(player);
			
		}
		
		PlayerBO playerbo = new PlayerBO();
		
		System.out.println("Enter a search type:\r\n"
				+ "1.By Nationality\r\n"
				+ "2.By Date of Birth\r\n"
				+ "3.By Power Rating");
		int type = sc.nextInt();
		sc.nextLine();
		switch (type) {
		case 1:
			System.out.println("Enter the Nationality:");
			String nationality = sc.nextLine();
			List<Player> playerByNationality = playerbo.findPlayer(playerList, nationality);
			System.out.format("%-15s%-15s%-15s%-20s%-15s%-15s%-15s%10s\n","Name","Date of Birth","Skill","Number of Wickets","Runs","Wickets","Nationality","Power Rating");
			
			for (Player player : playerByNationality) {
				System.out.printf("%-15s%-15s%-15s%-20d%-15d%-15d%-15s%-10.1f\n",
					    player.getName(),
					    player.getDateOfBirth(),
					    player.getSkill(),
					    player.getNumberOfMatches(),
					    player.getRuns(),
					    player.getWickets(),
					    player.getNationality(),
					    player.getPowerRating());
			}
			break;
		case 2:
			System.out.println("Enter the Date of Birth:");
			LocalDate dateOfBirth = LocalDate.parse(sc.next());
			List<Player> playerByDOB = playerbo.findPlayer(playerList, dateOfBirth);
			System.out.format("%-15s%-15s%-15s%-20s%-15s%-15s%-15s%10s\n","Name","Date of Birth","Skill","Number of Wickets","Runs","Wickets","Nationality","Power Rating");
			
			for (Player player : playerByDOB) {
				System.out.printf("%-15s%-15s%-15s%-20d%-15d%-15d%-15s%-10.1f\n",
					    player.getName(),
					    player.getDateOfBirth(),
					    player.getSkill(),
					    player.getNumberOfMatches(),
					    player.getRuns(),
					    player.getWickets(),
					    player.getNationality(),
					    player.getPowerRating());
			}
			break;
		case 3:
			System.out.println("Enter the Nationality:");
			Double powerRating = sc.nextDouble();
			List<Player> playerByRating = playerbo.findPlayer(playerList, powerRating);
			System.out.format("%-15s%-15s%-15s%-20s%-15s%-15s%-15s%10s\n","Name","Date of Birth","Skill","Number of Wickets","Runs","Wickets","Nationality","Power Rating");
			
			for (Player player : playerByRating) {
				System.out.printf("%-15s%-15s%-15s%-20d%-15d%-15d%-15s%-10.1f\n",
					    player.getName(),
					    player.getDateOfBirth(),
					    player.getSkill(),
					    player.getNumberOfMatches(),
					    player.getRuns(),
					    player.getWickets(),
					    player.getNationality(),
					    player.getPowerRating());
			}
			break;
		default:
			System.out.println("Invalid.");
			break;
		}
	}

}