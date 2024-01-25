import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String companyCode = "1298";
        
        System.out.println("Enter your password:");
        String pass = scanner.nextLine();
        
        System.out.println("Enter the company's secret code:");
        String code = scanner.nextLine();
        
        String password = pass + code;
        
        if (code.equals(companyCode)) {
            System.out.println("Access granted");
        } else {
            System.out.println(password + " is denied");
        }

    }
}
