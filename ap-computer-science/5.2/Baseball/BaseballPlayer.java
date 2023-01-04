public class BaseballPlayer
{
    private int hits;
    private int atBats;
    private String name;
    
    public BaseballPlayer(String name2, int hits1, int atBats1) {
        name = name2;
        hits = hits1;
        atBats = atBats1;
    }
    
    public void printBattingAverage()
    {
        double battingAverage = hits / (double) atBats;
        System.out.println(battingAverage);
    }
    
    public String toString()
    {
        return name + ": " + hits + "/" + atBats;
    }
    
    
}
