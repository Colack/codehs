public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");

        double zero = 0.0;
        double angle = Math.PI / 2;
        double pi = Math.PI;

        double cosZero = Math.round(Math.cos(zero) * 100.0) / 100.0;
        double sinZero = Math.round(Math.sin(zero) * 100.0) / 100.0;
        System.out.println(zero + ": " + cosZero + ", " + sinZero);
        
        double cosAng = Math.round(Math.cos(angle) * 100.0) / 100.0;
        double sinAng = Math.round(Math.sin(angle) * 100.0) / 100.0;
        System.out.println(angle + ": " + cosAng + ", " + sinAng);

        double cosPI = Math.round(Math.cos(pi) * 100.0) / 100.0;
        double sinPI = Math.round(Math.sin(pi) * 100.0) / 100.0;
        System.out.println(pi + ": " + cosPI + ", " + sinPI);
    }
}