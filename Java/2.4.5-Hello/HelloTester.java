import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        Hello world = new Hello(name);
        
        world.spanish();
        world.english();
        world.french();
        world.german();

    }
}