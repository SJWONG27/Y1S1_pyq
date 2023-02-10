
package Y2017_1;
import java.util.Scanner;
public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double initial =0, rate=0;
        int year =0;
        System.out.print("Enter the initial tuition fee: ");
        initial = sc.nextDouble();
        System.out.print("Enter the yearly rate of increment: ");
        rate = sc.nextDouble();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        year = sc.nextInt();
        System.out.print("Computed tuition fee for year " + year + " is: ");
        System.out.printf("%.2f\n",computeFee(initial,rate, year));
    }
    public static double computeFee(double initial, double rate, int year){
        double computed01 = 0, computed02 =0;
        for(int i =1; i<year ; i++){
            computed01 = initial*(rate/100+1);
            computed02 = computed01*(rate/100+1);
        }
        return computed02;
    }
    
}
