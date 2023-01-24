public class Fraction
{
    private int num;
    private int den;
    
    public Fraction(int nums, int dens) {
        num = nums;
        den = dens;
    }
    
    public int getNumerator() {
        return num;
    }
    
    public int getDenominator() {
        return den;
    }
    
    public void setNumerator(int x) {
        num = x;
    }
    
    public void setDenominator(int x) {
        den = x;
    }
    
    public void add(Fraction other) {
        int x = other.getNumerator() * den;
        num *= other.getDenominator();
        den *= other.getDenominator();
        num = num + x;
    }
    
    public void subtract(Fraction other) {
        int x = other.getNumerator() * den;
        num *= other.getDenominator();
        den *= other.getDenominator();
        num = num - x;
    }
    
    public void multiply(Fraction other) {
        num *= other.getNumerator();
        den *= other.getDenominator();
    }
    
    public String toString() {
        return num + " / " + den;
    }
}
