public class Construction
{
    
    private double lumber;  
    private double windows;
    private double taxRate; 
   
    
    public Construction(double lumberPrice, double windowPrice, double taxes)
    {
        lumber = lumberPrice;
        windows = windowPrice;
        taxRate = taxes;
    }
    
    public double lumberCost(int numBoards)
    {
        return lumber * numBoards;   
    }

    public double windowCost(int numWindows)
    {
        return windows * numWindows;   
    }

    public double grandTotal(double total)
    {
        return total * (1 + taxRate);
    }
    
}