public class MicrowaveCooking
{
    public static void main(String[] args)
    {
        int min = 90;
        int max = 240;
        
        int randomTime = (int)Math.floor(Math.random()*(max-min+1)+min);
        
        System.out.println("Microwaving for " + randomTime + " seconds");
        
        if (randomTime <= 120) {
            System.out.println("Rolls will be the right temperature!");
        } else {
            System.out.println("Rolls will be boiling hot!");
        }
    }
}
