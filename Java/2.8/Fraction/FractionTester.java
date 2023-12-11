import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Fraction fraction1 = new Fraction(1, 2);
        
        System.out.println("Enter the numerator:");
        int temp3 = input.nextInt();
        
        System.out.println("Enter the denominator:");
        int temp4 = input.nextInt();
        
        Fraction fraction2 = new Fraction(temp3, temp4);
        
        System.out.print(fraction1 + " + " + fraction2 + " = "  + (fraction1.getNumerator()*fraction2.getDenominator()+fraction1.getDenominator()*fraction2.getNumerator()) + "/" + (fraction1.getDenominator()*fraction2.getDenominator()));
    }
}
