public class FallingBodies
{
    public static void main(String[] args)
    {
        double gravity = 9.8;
        int time = 25;
        double h = 0.5 * gravity * (time * time);
        double v = gravity * time;

        System.out.println("Height: " + h);
        System.out.println("Velocity: " + v);
    }
}
