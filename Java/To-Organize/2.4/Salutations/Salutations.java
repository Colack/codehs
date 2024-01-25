public class Salutations
{
    private String letterName;
    
    public Salutations(String name)
    {
        letterName = name;
    }
    
    public void addressLetter()
    {
        System.out.println("Dear " + letterName);
    }
    
    public void signLetter()
    {
        System.out.println("Sincerely, \n " + letterName);
    }
    
    public void addressMemo()
    {
        System.out.println("To whom it may concern");
    }
    
    public void signMemo()
    {
        System.out.println("Best, " + letterName);
    }
}
