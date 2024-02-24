public class RosterOrganizer
{
    private String student;
    
    public RosterOrganizer(String studentName)
    {
        student = studentName;
    }

    public String getStudent()
    {
        return student;
    }

    public boolean placeBefore(String otherStudent)
    {
        return otherStudent.compareTo(student) > 0;
    }

    public boolean placeAfter(String otherStudent)
    {
        return otherStudent.compareTo(student) < 0;
    }

    public boolean isEqual(String otherStudent)
    {
        return otherStudent.compareTo(student) == 0;
    }
    
    
}