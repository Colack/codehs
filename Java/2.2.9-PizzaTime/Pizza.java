public class Pizza
{
    private String type;
    private String toppings;
    private int size;
    
    public Pizza(String theType, String theToppings, int theSize){
        
    }
    
    public String toString()
    {
        return size + " inch " + type + " pizza with " + toppings;
    }
}