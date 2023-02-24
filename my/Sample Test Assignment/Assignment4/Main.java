package Assignment4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of the players:");
		int n = sc.nextInt(); sc.nextLine();
		
		Player player = new Player();
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
			
			player = new Player(name, dateOfBirth, skill, numberOfMatches, runs, wickets, nationality, powerRating);
			playerList.add(player);
		}
		
		Map<String, Integer> nationalityCount = Player.calculateNationalityCount(playerList);
		
		System.out.format("%-15s %s\n","Country","Count");
		for (Map.Entry<String, Integer> entry : nationalityCount.entrySet()) {
            System.out.format("%-15s %s\n",entry.getKey(),entry.getValue());
        }

	}

}

