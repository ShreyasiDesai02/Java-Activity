package Sort_team_player;

import java.util.*;

public class PlayerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Team> teams = new ArrayList<>();
        System.out.println("Enter the Number Of Player:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\|");
            String teamName = input[0];
            String playerName = input[1];
            boolean found = false;

            for (Team team : teams) {
                if (team.getName().equals(teamName)) {
                    team.addPlayer(playerName);
                    found = true;
                    break;
                }
            }

            if (!found) {
                Team team = new Team(teamName);
                team.addPlayer(playerName);
                teams.add(team);
            }
        }

        Collections.sort(teams);

        for (Team team : teams) {
            System.out.println(team.getName() + ":");
            List<Player> players = team.getPlayerList();
            for (Player player : players) {
                System.out.println("--" + player.getName());
            }
        }
    }
}
