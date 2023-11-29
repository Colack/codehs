import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How much does dinner usually cost?");
        Double dinnercost = input.nextDouble();
        
        System.out.println("How much is laser tag for one person?");
        Double lasercost = input.nextDouble();
        
        System.out.println("How much does a triple scoop cost?");
        Double icecost = input.nextDouble();
        
        Double dinnerdoublecost = (dinnercost + (dinnercost * 2));
        System.out.println("Dinner: "+ dinnerdoublecost);
        
        Double lasersamecost = lasercost * 2;
        System.out.println("Laser Tag: " + lasersamecost);
        
        Double icethirdcost = (icecost + (icecost / 3));
        System.out.println("Ice-cream: " + icethirdcost);
        
        Double finalCost = dinnerdoublecost + lasersamecost + icethirdcost;
        System.out.println("Grand Total: " + finalCost);
        
    }
}
