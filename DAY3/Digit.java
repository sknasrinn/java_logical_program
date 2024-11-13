import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

                number = Math.abs(number);

        
        int[] frequency = new int[10];

                while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}