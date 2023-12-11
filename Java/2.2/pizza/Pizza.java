public class Pizza
{
    // Add the instance variables here
    private String type;
    private String toppings;
    private int size;
    
    
    
    // Put the constructor here
    public Pizza(String typea, String toppingsa, int sizea)
    {
        type = typea;
        toppings = toppingsa;
        size = sizea;
    }
    
    
    // You don't need to do anything with this method
    // Used to print the object
    public String toString()
    {
        return size + " inch " + type + " pizza with " + toppings;
    }
}
