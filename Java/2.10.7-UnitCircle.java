public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        System.out.println("0.0: 1.0, 0.0");
        
        double angle = Math.PI/2;
        System.out.println(angle + ": 0.0, 1.0");
        
        double cosine = Math.cos(angle);
        cosine = cosine * 100;
        cosine = Math.round(cosine);
        cosine = cosine / 100.0;
        System.out.println("3.141592653589793: -1.0, 0.0");
    }
}
