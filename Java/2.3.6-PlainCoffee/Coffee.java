public class Coffee
{
    private int brewStrength;
    private boolean sugar;
    
    private String milkType; 
    
    public Coffee()
    {
        brewStrength = 2;
        sugar = true;
        milkType = "nonfat";
    }
    
    public Coffee(int howStrong, boolean hasSugar, String milk)
    {
        brewStrength = howStrong;
        sugar = hasSugar;
        milkType = milk;
    }
    
    public String toString()
    {
        return "Coffee brewed to level " + brewStrength + " with " + milkType + " milk. Sugar? " + sugar;
    }
    
}