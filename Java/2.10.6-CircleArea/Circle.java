public class Circle
{
    private double radius;
    
    public Circle(double theRadius)
    {
        radius = theRadius;
    }

    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2); 
    }

    public double getSphereVolume()
    {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3); 
    }  
}