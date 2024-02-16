import java.util.Random;

public class RaceMain
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double race1Speed = rand.nextDouble();
        double race2Speed = rand.nextDouble();
        
        
        // Create two Racecar objects
        Racecar racer1 = new Racecar(race1Speed, "Jack");
        Racecar racer2 = new Racecar(race2Speed, "Jack2");
        
        // Compute the finishing times for both cars
        double firstTime = racer1.computeTime(distance);
        double secondTime = racer2.computeTime(distance);
        
        System.out.println("First car finished in " + firstTime + " seconds");
        System.out.println("Second car finished in " + secondTime + " seconds");
        
    }
}
