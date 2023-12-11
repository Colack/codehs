import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments like the last exercise
        // to remind yourself what you need to do
        
        //To get started, create a new Calculator object
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter two doubles");
        double ax = scanner.nextDouble();
        double ay = scanner.nextDouble();
        
        Calculator calc = new Calculator();
        
        calc.sum(ax, ay);
        calc.subtract(ax, ay);
        calc.multiply(ax, ay);
        calc.divide(ax, ay);
    }
}
