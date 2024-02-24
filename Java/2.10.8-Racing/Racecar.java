public class Racecar
{
    private double accel;
    private String name;
    
    public Racecar(double acceleration, String driver)
    {
        accel = acceleration;
        name = driver;
    }

    public double computeTime(double distance)
    {
        double t = Math.sqrt((2*distance)/(accel));
        return Math.round(t * 100.0) / 100.0;
    }
    
    public String toString()
    {
        return "Racer " + name;
    }
}