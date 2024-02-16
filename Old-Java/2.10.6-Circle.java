public class Circle
{
    private double radius;
    
    public Circle(double theRadius)
    {
        radius = theRadius;
    }

    public double getArea()
    {
        double area = radius * radius * Math.PI;
        return area;
    }
    
    public double getSphereVolume()
    {
        double volume = (4.0 / 3.0) * radius * radius * radius * Math.PI;
        return volume;
    }
    
    
    
}
