public class Student
{
    private static final int NUM_EXAMS = 4;
    
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    
    private int[] exams;
    private int numExamsTaken;

    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        exams = new int[NUM_EXAMS];
        numExamsTaken = 0;
    }
    
    public int getExamImprovement()
    {
		int val = 0;
		for(int i = 1; i < numExamsTaken; i++)
		{
			val +=  exams[i]-exams[i-1];
		}
		return val;
    }
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public void addExamScore(int score)
    {
        exams[numExamsTaken] = score;
        numExamsTaken++;
    }
    
    public void setGPA(double theGPA)
    {
        gpa = theGPA;
    }

    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}