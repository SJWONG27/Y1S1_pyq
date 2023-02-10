
package Y2016_2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Enter the value n for a regular polygon, n: ");
        int n = sc.nextInt();
        System.out.print("Enter the length of a particular side of the regular polygon (in meter)");
        double s = sc.nextDouble();
        System.out.println("The area is: " + df.format(area(n,s)) + " squared meters.");
    }
    public static double area(int n, double s){
        double area = (n*s*s) / (4 * Math.tan(Math.toRadians(180/n)));
        return area;
    }
    
}
