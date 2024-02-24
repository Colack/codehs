public class NumberGames
{
    private double num;

    public NumberGames(double startingNumber)
    {
        num = startingNumber;
    }

    public double getNumber()
    {
        return num;
    }

    public double doubleNumber()
    {
        num *= 2;
        return num;
    }

    public double squareNumber()
    {
        num *= num;
        return num;
    }  
}