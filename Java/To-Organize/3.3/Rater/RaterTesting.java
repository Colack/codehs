public class RaterTesting
{
    public static void main(String[] args)
    {
        Rater rater = new Rater("Eternal Industries", 2);
        rater.updateReview();
        System.out.println(rater);
        
        rater.setRating(4);
        rater.updateReview();
        System.out.println(rater);
        
    }
}
