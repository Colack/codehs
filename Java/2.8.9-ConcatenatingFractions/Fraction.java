public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction(int numer, int denom)
    {
        numerator = numer;
        denominator = denom;
    }
    
    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public String toString()
    {
        return numerator + "/" + denominator;
    }
    
    
}