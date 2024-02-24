public class Rater
{
    private String name;
    private double rating;
    
    public Rater(String company, double initialRating)
    {
        name = company;
        rating = initialRating;
    }
    
    public void setRating(double newRating)
    {
        rating = Math.min(newRating, 5.0);
    }

    public double getRating()
    {
        return rating;
    }

    public String toString()
    {
        if (rating < 2) {
            return "Not Recommended Company " + name;
        }
        if (rating > 3.5) {
            return "Gold Star Company " + name;
        }
        return "Well Rated Company " + name;
    }
}