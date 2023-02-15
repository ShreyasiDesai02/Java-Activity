package Sort_team_player;

import java.util.*;

public class Team implements Comparable<Team> {
    private String name;
    private List<Player> playerList;

    public Team(String name) {
        this.name = name;
        this.playerList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayerList() {
        Collections.sort(playerList);
        return playerList;
    }

    public void addPlayer(String playerName) {
        Player player = new Player(playerName);
        playerList.add(player);
    }

    @Override
    public int compareTo(Team other) {
        return this.name.compareTo(other.getName());
    }
}
