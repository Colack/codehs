public class WebsiteTester
{
    public static void main(String[] args)
    {
        Website blank = new Website();
        Website goodSchool = new Website("goodSchool", "edu");
        Website codehs = new Website("codehs", "com", 1000000);
        
        System.out.println(blank);
        System.out.println(goodSchool);
        System.out.println(codehs);
    }
}
