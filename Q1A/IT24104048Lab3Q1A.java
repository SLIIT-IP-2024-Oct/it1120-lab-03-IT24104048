import java.util.Scanner;

public class IT24104048Lab3Q1A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the price of 1 kg rice: ");
        int price_of_1kg_rice = scan.nextInt();

        System.out.print("Enter the number of kilograms you want to buy: ");
        int no_of_kilograms = scan.nextInt();

        double total_amount = price_of_1kg_rice * no_of_kilograms;
        System.out.println("The total amount is: " + total_amount);

        scan.close();
    }
}
