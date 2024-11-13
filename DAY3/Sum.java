import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
                int sum = 0;
        
               while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add the digit to sum
            number /= 10; // Remove the last digit
        }
        
                System.out.println("The sum of the digits is: " + sum);
        
                scanner.close();
    }
}