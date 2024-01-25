import java.util.Scanner;

public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    // Returns the numerator
    public int getNumerator()
    {
        return numerator;
    }
    
    // Returns the denominator
    public int getDenominator()
    {
        return denominator;
    }
    
    
    // Returns a string representing a fraction
    // in the form
    // numerator/denominator
    public String toString()
    {
        return this.numerator + "/" + this.denominator;
    }
    
    
}
