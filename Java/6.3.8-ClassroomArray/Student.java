public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }

    public int getGradeLevel()
    {
        return gradeLevel;
    }
    
    
    public String toString()
    {
        return "Student " + lastName + ", " + firstName;
    }
}