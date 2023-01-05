public class StudentTester
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 11, "Liberty High School");
        SchoolClub club = new SchoolClub(alan, "yes");
        
        System.out.println(club);
        
    }
}
