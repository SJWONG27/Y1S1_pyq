
package Y2017_1;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First complex number. Enter a number for the real part: ");
        double a1= sc.nextDouble();
        System.out.print("First complex number. Enter a number for the imaginary part: ");
        double a2 = sc.nextDouble();
        System.out.print("Second complex number. Enter a number for the real part: ");
        double b1 = sc.nextDouble();
        System.out.print("Second complex number. Enter a number for the imaginary part: ");
        double b2 = sc.nextDouble();
        
        Complex a = new Complex(a1,a2);
        Complex b = new Complex(b1,b2);
        System.out.println("First complex number: " + a);
        System.out.println("Second complex number: " +b);
        System.out.println("");
        System.out.println("Addition of the two complex numbers: " + a.addComplexNum(b));
        System.out.println("Subtraction of the two complex numbers: " + a.subtractComplexNum(b));
    }  
}

