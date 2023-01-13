public class Comment
{
    private String poster;
    private String comment;
    private String date;
    
    public Comment(String personPosting, String message, String commentDate)
    {
        poster = personPosting;
        comment = message;
        date = commentDate;
    }
    
    public String getPoster() {
        return poster;
    }
    
    public String getComment() {
        return comment;
    }
    
    public String getDate() {
        return date;
    }
    
    public String toString()
    {
        return comment + "\n--" + poster + "(" + date + ")";
    }
}



