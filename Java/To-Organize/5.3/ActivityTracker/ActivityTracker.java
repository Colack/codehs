public class ActivityTracker
{
    public static void main(String[] args)
    {
        // Create a Activity log object.
        ActivityLog mylog = new ActivityLog();
        
        // Add miles to the activity log class.
        mylog.addMiles(5);
        mylog.addHours(1);
        
        // Print out the total miles.
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        
        // Get the hours from today in total miles.
        double hoursToday = mylog.getHours();
        
        // Add more hours.
        mylog.addHours(1.5);
        mylog.addHours(3);
        
        // subtract the hours from the total hours today.
        double increase = mylog.getHours() - hoursToday;
        
        // Log the current increase.
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}
