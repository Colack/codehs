public class Extremes
{
    Integer min;
    Integer max;

    public Extremes()
    {
        max = Integer.MAX_VALUE;
        min = Integer.MIN_VALUE;
    }

    public Integer maxQuotient(Integer number)
    {
        return max / number;
    }

    public Integer minQuotient(Integer number)
    {
        return min / number;
    }

    public String toString()
    {
        return "[" + min + ", " + max + "]";   
    }
}