public class Pinata
{
    private String candy; 
    private String color;    
    private String shape;

    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
    public Pinata(String type_candy, String type_colour, String type_shape)
    {
        candy = type_candy;
        color = type_colour;
        shape = type_shape;
    }
    
    public Pinata(String type_colour, String type_shape)
    {
        candy = "hard candy";
        color = type_colour;
        shape = type_shape;
    }
    
    public Pinata(String type_candy)
    {
        candy = type_candy;
        color = "rainbow";
        shape = "donkey";
    }
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}