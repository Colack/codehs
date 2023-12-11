import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the sales tax rate:");
        Double salesTax = scanner.nextDouble();
        
        System.out.println("How many boards do you need?");
        Double boards = scanner.nextDouble();
        
        System.out.println("How many windows do yo uneed?");
        Double windows = scanner.nextDouble();
        
        Double temp = boards * 8;
        Double temp2 = windows * 11;
        Double total = temp + temp2;
        Double tax = total * salesTax;
        Double grandTotal = tax + total;
        
        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + grandTotal);
    }
}
