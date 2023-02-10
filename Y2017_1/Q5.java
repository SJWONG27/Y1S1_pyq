
package Y2017_1;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        GradedActivity ga = new GradedActivity();
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        int a = sc.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        int b = sc.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        int c = sc.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int d = sc.nextInt();
        Essay e = new Essay(a,b,c,d);
        ga.getScore(a, b, c, d);
        System.out.println("");
        System.out.println(e.toString());
        System.out.println("");
        System.out.println(ga.toString());
    }
    
}
