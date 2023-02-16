package Example2;

public class Team {
    private String name;
    private long matches;
    public Team(String name,long matches){
        this.name = name;
        this.matches = matches;

    }
    public long getMatches() {
        return matches;
    }
    public String getName() {
        return name;
    }
    public void setMatches(long matches) {
        this.matches = matches;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name+" ---- " +matches;
    }
    

    
}