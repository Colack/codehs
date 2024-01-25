public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    public Pinata(String candya, String colora, String shapea)
    {
        candy = candya;
        color = colora;
        shape = shapea;
    }
    
    
    // Add an overloaded constructor that allows the user
    // to customize the color and shape
    public Pinata(String colore, String shapee)
    {
        color = colore;
        shape = shapee;
        candy = "hard candy";
    }
    
    
    // Add an overloaded constructor that allows the user
    // to customize the candy
    public Pinata(String candyt)
    {
        color = "rainbow";
        shape = "donkey";
        candy = candyt;
    }
    
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}
