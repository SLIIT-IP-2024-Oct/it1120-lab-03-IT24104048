import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Input the monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        // Input the number of OT hours
        System.out.print("Enter the number of OT hours: ");
        int noOfOTHours = scanner.nextInt();

        // Input the OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();

        // Calculate OT amount
        double otAmount = noOfOTHours * otHourlyRate;

        // Calculate total salary
        double totalSalary = monthlySalary + otAmount;

        // Output the total salary
        System.out.println("The total salary is: " + totalSalary);

        // Close the scanner
        scanner.close();
    }
}
 