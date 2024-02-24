public class Currency
{
    private Double value;

    public Currency(Double startValue)
    {
        value = startValue;
    }

    public void setValue(Double newValue)
    {
        value = newValue;
    }

    public Integer getDollars()
    {
        int dollars = (int) value.doubleValue();
        return dollars;
    }

    public Integer getCents()
    {
        int cents = (int)(value * 100) % 100;
        return cents;
    }

    public String toString()
    {
        return "$" + getDollars() + "." + getCents();
    }
}