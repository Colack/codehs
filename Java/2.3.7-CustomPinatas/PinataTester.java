public class PinataTester
{
    public static void main(String[] args)
    {
        Pinata ella = new Pinata();
        Pinata pete = new Pinata("chocolate", "blue", "star");
        Pinata sweetie = new Pinata("sour straws");
        
        System.out.println(ella);
        System.out.println(pete);
        System.out.println(sweetie);
    }
}