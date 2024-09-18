import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("      AAA         CCCCCCCCCCCC");
        System.out.println("     AAAAA        CCCCCCCCCCCC");
        System.out.println("   AA     AA      CCC");
        System.out.println("  AAA     AAA     CCC");
        System.out.println("AAAAAAAAAAAAAAA   CCC");
        System.out.println("AAAAAAAAAAAAAAA   CCC");
        System.out.println("AAAA       AAAA   CCC");
        System.out.println("AAAA       AAAA   CCCCCCCCCCCC");
        System.out.println("AAAA       AAAA   CCCCCCCCCCCC");
        System.out.println("");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number in Fahrenheit: ");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        
        System.out.println("Please enter a 5-character string: ");
        String stringInputted = scan.next();
        if (stringInputted.length() == 5) {
            String middle = stringInputted.substring(1, 4);
            String stringBackwards = new StringBuilder(middle).reverse().toString();
            
            Random random = new Random();
            int randomNumber = random.nextInt(16384 - 32 + 1) + 32;
            
            System.out.println("Random number generated. Continuing...");
            System.out.println("Your new string is " + celsius + stringBackwards + randomNumber);
        } else {
            System.out.println("Please enter exactly 5 characters!");
        }
        
        scan.close();
    }
}
