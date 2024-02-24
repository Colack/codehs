public class Parakeet 
{
    private String name;
    private String color;
    
    public Parakeet(String birdsName, String colour)
    {
        name = birdsName;
        color = colour;
    }
    
    public String toString()
    {
        return name + " is a " + color + " parakeet";
    }
}