
package Y2016_2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Enter the weight in pounds: ");
        double pound = sc.nextDouble();
        double kilo = pound*0.454;
        System.out.println(pound+ " pounds is " + df.format(kilo) + " kilograms");
    }
    
}
