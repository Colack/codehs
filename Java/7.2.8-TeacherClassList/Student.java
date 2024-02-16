import java.util.ArrayList;
public class Student
{
    private String name;
    private int grade;
    
    private static ArrayList<Student> classList = new ArrayList<Student>();
    
    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
        classList.add(this);
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public static String printClassList()
    {
        String names = "";
        for(Student name: classList)
        {
            names+= name.getName() + "\n";
        }
        return "Student Class List:\n" + names;
    }
}