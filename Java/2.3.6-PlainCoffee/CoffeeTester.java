public class CoffeeTester
{
    public static void main(String[] args)
    {
        Coffee latte = new Coffee(4, false, "soy");
        System.out.println(latte);
        
        Coffee plain = new Coffee();
        System.out.println(plain);
        
    }
}