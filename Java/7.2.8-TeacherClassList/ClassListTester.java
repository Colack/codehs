public class ClassListTester
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", 11);
        Student kevin = new Student("Kevin", 10);
        Student annie = new Student("Annie", 12);
        System.out.println(Student.printClassList());
    }
}