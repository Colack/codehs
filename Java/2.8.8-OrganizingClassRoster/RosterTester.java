import java.util.Scanner;

public class RosterTester
{
    public static void main(String[] args)
    {
        RosterOrganizer currentStudent = new RosterOrganizer("Jose");
        
        System.out.println("\n\n");
        System.out.print("Enter a name: ");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println(currentStudent.getStudent() + " place before " + name + "?");
        System.out.println(currentStudent.placeBefore(name));
        System.out.println(currentStudent.getStudent() + " place after " + name + "?");
        System.out.println(currentStudent.placeAfter(name));
        System.out.println(currentStudent.getStudent() + " is equal to  " + name + "?");
        System.out.println(currentStudent.isEqual(name));

    }
}