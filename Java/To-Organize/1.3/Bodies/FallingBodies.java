public class FallingBodies
{
    public static void main(String[] args)
    {
        final double g = 9.8;
        final int t = 23;
        double h = 0.5 * g * t * t;
        double v = g *t;
        System.out.println("Height: " + h);
        System.out.println("Velocity: " + v);
    }
}
