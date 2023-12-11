public class PlayerTester
{
    public static void main(String[] args) {
       
        CricketPlayer brian = new CricketPlayer("Brian Lara", "Team");
        CricketPlayer fabian = new CricketPlayer("Fabian Allen");
        
        brian.addMatch(10, 15);
        fabian.addMatch(15, 10);
        
        brian.addMatch(5, 1);
        fabian.addMatch(1, 5);
        
        brian.addMatch(8, 4);
        fabian.addMatch(4, 8);
        
        brian.addMatch(7, 3);
        fabian.addMatch(3, 7);
        
        System.out.println("Brian Lara's Stats:");
        brian.printRunsScored();
        brian.printBallsBowled();
        System.out.println(brian);
        System.out.println();
        
        System.out.println("Fabian Allen's Stats:");
        fabian.printRunsScored();
        fabian.printBallsBowled();
        System.out.println(fabian);
    }
}
