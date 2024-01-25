public class PointTester
{
    public static void main(String[] args)
    {
        Point p = new Point(10, 5);
        System.out.println(p);
        p.move(3, 4);
        
        System.out.println(p);
        
        // Make a new point here at position (2, 4)
        
        // Then print it out
        
        // Move the point 5 units in the x direction and
        // 2 units in the y direction
        
        // Print out the point again to see that it moved
        Point x = new Point(2, 4);
        System.out.println(x);
        x.move(5, 2);
        System.out.println(x);
    }
}
