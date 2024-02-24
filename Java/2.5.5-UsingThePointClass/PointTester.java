public class PointTester
{
    public static void main(String[] args)
    {
        Point p = new Point(10, 5);
        System.out.println(p);
        p.move(3, 4);
        
        System.out.println(p);

        Point p2 = new Point(2, 4);

        System.out.println(p2);

        p2.move(5, 2);

        System.out.println(p2);
    }
}