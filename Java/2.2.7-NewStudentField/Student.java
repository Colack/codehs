public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private int numClubs;
    
    public Student(String fName, String lName, int grade, int clubs)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        numClubs = clubs;
    }
    
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel + 
            " and is in " + numClubs + " club(s).";
    }
}