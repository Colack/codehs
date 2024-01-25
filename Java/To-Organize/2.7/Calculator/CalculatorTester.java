import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        System.out.println("Enter two doubles");
        
        double temp1 = scanner.nextDouble();
        double temp2 = scanner.nextDouble();
        
        System.out.println(temp1 + " + " + temp2 + " = " + calc.sum(temp1, temp2));
        System.out.println(temp1 + " - " + temp2 + " = " + calc.subtract(temp1, temp2));
        System.out.println(temp1 + " * " + temp2 + " = " + calc.multiply(temp1, temp2));
        System.out.println(temp1 + " / " + temp2 + " = " + calc.divide(temp1, temp2));
    }
}
