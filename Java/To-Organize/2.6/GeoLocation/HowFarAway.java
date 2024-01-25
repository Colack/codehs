import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the latitude of the starting location: ");
        Double startLatitude = scanner.nextDouble();
        
        System.out.print("\nEnter the longitude of the starting location: ");
        Double startLongitude = scanner.nextDouble();
        
        System.out.print("\nEnter the latitude of the ending location: ");
        Double endLatitude = scanner.nextDouble();
        
        System.out.print("\nEnter the longitude of the ending location: ");
        Double endLongitude = scanner.nextDouble();
        
        GeoLocation start = new GeoLocation(startLatitude, startLongitude);
        GeoLocation end = new GeoLocation(endLatitude, endLongitude);
        
        System.out.println("The distance is " + start.distanceFrom(end) + " miles.");
    }
}
