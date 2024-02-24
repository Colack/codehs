public class RaceMain
{
    public static void main(String[] args)
    {
        double distance = 2414;

        double accel1 = 1000;
        double accel2 = 500;

        Racecar car1 = new Racecar(accel1, "Imagine getting second");
        Racecar car2 = new Racecar(accel2, ":(");

        double time1 = car1.computeTime(distance);
        double time2 = car2.computeTime(distance);

        System.out.println("First car finished in " + time1 + " seconds");
        System.out.println("Second car finished in " + time2 + " seconds");
    }
}