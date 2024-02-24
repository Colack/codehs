import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        Fraction frac1 = new Fraction(1, 2);
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please input numerator: ");
        int numerator = input.nextInt();
        
        System.out.println("Please input denominator: ");
        int denominator = input.nextInt();

        Fraction frac2 = new Fraction(numerator, denominator);
        
        int outputNumerator = (frac1.getNumerator() * frac2.getDenominator() + frac1.getDenominator() * frac2.getNumerator());
        int outputDenominator = (frac1.getDenominator() * frac2.getDenominator());
        
        Fraction frac3 = new Fraction(outputNumerator, outputDenominator);

        System.out.println(frac1 + " + " + frac2 + " = " + frac3);
    }
}