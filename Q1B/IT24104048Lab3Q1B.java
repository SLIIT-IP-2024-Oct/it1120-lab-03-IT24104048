import java.util.Scanner;

public class IT24104048Lab3Q1B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the price of 1 kg rice: ");
        int price_of_1kg_rice = scan.nextInt();

        System.out.print("Enter the number of kilograms you want to buy: ");
        int no_of_kilograms = scan.nextInt();

        // Calculate total amount without discount
        double total_amount = price_of_1kg_rice * no_of_kilograms;

        // Calculate 10% discount
        double discount = total_amount * 0.10;

        // Calculate final amount after discount
        double final_amount = total_amount - discount;

        System.out.println("The total amount before discount is: " + total_amount);
        System.out.println("The discount is: " + discount);
        System.out.println("The final amount to pay after discount is: " + final_amount);

        scan.close();
    }
}
