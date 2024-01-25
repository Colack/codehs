public class AddFractions 
{
    public static void main(String[] args)
    {
        int num1 = 1;
        int den1 = 2;
        
        int num2 = 2;
        int den2 = 5;
        
        System.out.println("The numerator of the first fraction is " + num1);
        System.out.println("The denominator of the first fraction is " + den1);
        System.out.println("The numerator of the second fraction is " + num2);
        System.out.println("The denominator ofthe second fraction is " + den2);
        
        int temp1 = num1 * den2;
        int temp2 = num2 * den1;
        int temp3 = temp1 + temp2;
        int temp4 = den2 * den1;
        
        System.out.println("The sum of 1/2 + 2/5 = " + temp3 + "/" + temp4);
    }
}
