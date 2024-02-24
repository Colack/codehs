public class MicrowaveCooking
{
    public static void main(String[] args)
    {
        int secs = (int)(90 + (Math.random()*150+1));
        System.out.println(secs);

        if (secs <= 120) {
            System.out.println("Rolls will be the right temperature!");
        }
        else {
            System.out.println("Rolls will be boiling hot!");
        }
    }
}