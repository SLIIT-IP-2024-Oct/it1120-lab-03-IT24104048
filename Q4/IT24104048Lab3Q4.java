import java.util.Scanner;

public class IT24104048Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Ensure the number is five digits
        if (number < 10000 || number > 99999) {
            System.out.println("Error: Please enter a valid five-digit number.");
        } else {
            // Separate the digits
            int firstDigit = number / 10000;
            int secondDigit = (number / 1000) % 10;
            int thirdDigit = (number / 100) % 10;
            int fourthDigit = (number / 10) % 10;
            int fifthDigit = number % 10;

            // Print the digits separated by spaces
            System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + fourthDigit + " " + fifthDigit);
        }

        // Close the scanner
        scanner.close();
    }
}
