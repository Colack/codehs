public class ActivityLog
{
    private double numHours;
    private double numMiles;

    /*
        Constructor for the ActivityLog class.
    */
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    
    /*
        Adds hours to the object.
        @param  hours   the number of hours to add.
    */
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    /*
        Adds miles to the object.
        @param  miles   the number of miles to add.
    */
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    /*
        Returns the number of miles.
        @return the number of miles.
    */
    public double getMiles()
    {
        return numMiles;
    }
    
    /*
        Returns the number of hours.
        @return the number of hours.
    */
    public double getHours() 
    {
        return numHours;
    }
    
}
