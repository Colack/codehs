public class Rectangle
{
    private int width;
    private int height;
    
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}