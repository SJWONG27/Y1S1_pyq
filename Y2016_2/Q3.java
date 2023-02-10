
package Y2016_2;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line = sc.nextInt();
        for(int i =0; i<=line ; i++){
            for(int j =line-i-1; j>=0; j--){
                System.out.print(" ");
            }
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            for(int j =2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
