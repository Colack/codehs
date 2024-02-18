import java.util.ArrayList;

public class RoadTrip
{
    private ArrayList<GeoLocation> stops;
    public int numberOfStops = 0;
    
    public RoadTrip() {
        stops = new ArrayList<GeoLocation>();
    }
    
    public void addStop(String name, double latitude, double longitude)
    {
        GeoLocation stop = new GeoLocation(name, latitude, longitude);
        stops.add(stop);
        numberOfStops++;
    }
    
    public int getNumberOfStops()
    {
        return numberOfStops;
    }
    
    public double getTripLength()
    {
        double total = 0;
        for (int i = 1; i < stops.size(); i++)
        {
            total += stops.get(i - 1).distanceFrom(stops.get(i));
        }
        return total;
    }
    
    public String toString()
    {
        String output = "";
        for (int i = 0; i < stops.size(); i++)
        {
            GeoLocation stop = stops.get(i);
            output += (i + 1) + ". ";
            output += stop.getName() + " (";
            output += stop.getLatitude() + ", ";
            output += stop.getLongitude() + ")\n";
        }
        return output;
    }
}