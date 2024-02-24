public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle brick = new Rectangle(3, 6);
        Rectangle fencePost = new Rectangle(); 
        
        System.out.println(brick);
        System.out.println(fencePost);

        fencePost = new Rectangle(2, 10);
        System.out.println(fencePost);
        
    }
}