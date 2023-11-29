public class WorkShift
{
    public static void main(String[] args)
    {
        final int hours = 20;
        final int minutes = 42;
        final int seconds = 16;
        int finalTime = 0;
        
        finalTime += seconds;
        finalTime += hours * 3600;
        finalTime += minutes * 60;
        System.out.println("Seconds: " + finalTime);
    }
}
