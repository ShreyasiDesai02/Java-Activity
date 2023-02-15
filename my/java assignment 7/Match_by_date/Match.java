package Match_by_date;

import java.time.LocalDate;

public class Match implements Comparable<Match> {
    private LocalDate matchDate;
    private String team1;
    private String team2;
    
    public Match(LocalDate matchDate, String team1, String team2) {
        this.matchDate = matchDate;
        this.team1 = team1;
        this.team2 = team2;
    }
    
    public LocalDate getMatchDate() {
        return matchDate;
    }
    
    public String getTeam1() {
        return team1;
    }
    
    public String getTeam2() {
        return team2;
    }
    
    @Override
    public int compareTo(Match otherMatch) {
    	return (otherMatch.getMatchDate()).compareTo(matchDate);
    }
}
