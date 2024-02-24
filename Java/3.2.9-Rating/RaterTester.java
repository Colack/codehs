public class RaterTester
{
    public static void main(String[] args)
    {
        Rater jrs = new Rater("Jr Cookery", 2);

        System.out.println("Current Rating: " + jrs.getRating());
        System.out.println(jrs);

        jrs.setRating(4.5);
        System.out.println("\nCurrent Rating: " + jrs.getRating());
        System.out.println(jrs);

        jrs.setRating(100);
        System.out.println("\nCurrent Rating: " + jrs.getRating());
        System.out.println(jrs);

        jrs.setRating(1);
        System.out.println("\nCurrent Rating: " + jrs.getRating());
        System.out.println(jrs);
        
    }
}