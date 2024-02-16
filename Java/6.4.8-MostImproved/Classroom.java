public class Classroom
{
    Student[] students;
    int numStudentsAdded;
    
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }

    public Student getMostImprovedStudent()
    {
        Student stu = students[0];
		for(int i=0; i < numStudentsAdded; i++)
		{
			if(students[i].getExamImprovement() > stu.getExamImprovement())
			{
				stu = students[i];
			}
		}
		return stu;
    }
    
    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}