public class Rectangle
{
    private int width;
    private int height;
    
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    public Rectangle() {
        width = 7;
        height = 2;
    }
    
    public Rectangle(int sidelength)
    {
        width = sidelength;
        height = sidelength;
    }
    
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}