public class CricketPlayer {
    private String name;
    private String team;
    private int totalRunsScored;
    private int totalBallsBowled;
    private int matchesPlayed;


    public CricketPlayer(String playerName, String currentTeam) {
        name = playerName;
        team = currentTeam;
        
        totalRunsScored = 0;
        totalBallsBowled = 0;
        matchesPlayed = 0;
    }
    
    public CricketPlayer(String playerName){
        this(playerName, "no team");
    }
    
    public void addMatch(int runsScored, int ballsBowled){
        totalRunsScored += runsScored;
        totalBallsBowled += ballsBowled;
        matchesPlayed++;
    }
    
    public void printRunsScored(){
        System.out.print("Runs scored per match: ");
        System.out.println((double) totalRunsScored / matchesPlayed);
    }

    public void printBallsBowled() {
        System.out.print("Balls bowled per match: ");
        System.out.println((double) totalBallsBowled / matchesPlayed);
    }

    public String toString() {
        return name + " scored an average of " + ((double) totalRunsScored / matchesPlayed) +
            " runs during these " + matchesPlayed + " matches.";
    }

}