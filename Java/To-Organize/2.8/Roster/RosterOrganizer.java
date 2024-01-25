public class RosterOrganizer
{
    private String student;
    
    public RosterOrganizer(String studentName)
    {
        student = studentName;
    }
    
    // Returns the word
    public String getStudent()
    {
        return student;
    }
    
    // Returns true if student comes
    // before otherStudent.
    // Returns false otherwise.
    public boolean placeBefore(String otherStudent)
    {
        if (student.compareTo(otherStudent) < 0) {
            return true;
        } else {
            return false;
        }
    }
    
    
    // Returns true if student comes
    // after otherStudent.
    // Returns false otherwise.
    public boolean placeAfter(String otherStudent)
    {
        if (student.compareTo(otherStudent) > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    
    // Returns true if student is equal to otherStudent.
    // Returns false otherwise.
    public boolean isEqual(String otherStudent)
    {
        if (student.compareTo(otherStudent) == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    
}
