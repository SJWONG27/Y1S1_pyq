
package Y2018_1;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        int randomNum=0, x=0, y=0, z=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        System.out.print("The random Numbers are: ");
        for(int i =0; i<N; i++){
            randomNum = 50 + (int)(Math.random()*((150-50)+1));
            System.out.print(randomNum + " ");
            if(randomNum%10 >=0 && randomNum%10 <=3)
                x++;
            else if (randomNum%10 >=4 && randomNum%10 <=6)
                y++;
            else if (randomNum%10 >=7 && randomNum%10 <=9)
                z++;
        }
        
        
        System.out.println("");
        System.out.println("Group AAA: " + x);
        System.out.println("Group AA: " + y);
        System.out.println("Group A: " + z);
    }
    
}
