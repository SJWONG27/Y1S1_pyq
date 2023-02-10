
package Y2018_2;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bag;
        double weight;
        System.out.print("Enter the number of bags sold: ");
        bag = sc.nextInt();
        System.out.print("Enter the weight per bag(kilogram): ");
        weight = sc.nextDouble();
        double totalPrice = weight*bag*5.99;
        double totalPriceWithTax = totalPrice + totalPrice*0.0725;
        System.out.println("");
        System.out.println("Price per kilogram: $5.99");
        System.out.println("Sales tax: 7.25%");
        System.out.printf("Total price after tax: $%.2f" , totalPriceWithTax);
        System.out.println("");
    }
    
}
