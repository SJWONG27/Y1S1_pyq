
package Y2016_1;
import java.util.Scanner;
import java.util.Random;

public class Q2 {
    public static Scanner input = new Scanner(System.in);
    public static Random g = new Random();
    public static void main(String[] args) {
        final String [] choices = {"Paper", "Scissor", "Rock"};
        int cnt01 =0, cnt02=0;
        
        while(true){
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock : ");
            int playerChoice = input.nextInt();

            int computerChoice = g.nextInt(3)+1;

            System.out.println("Player : " + choices[playerChoice-1] + " ------- Computer : " + choices[computerChoice-1]);
            
            if (playerChoice == computerChoice){
                System.out.println("Draw!!!\n");
            }
            else if(playerChoice == 1){
                if(computerChoice == 2){
                    cnt02++;
                    System.out.println("Computer wins " + cnt02 + " time(s)\n");
                }else{
                cnt01++;
                System.out.println("Player wins " + cnt01 + " time(s)\n");
                }
            }
            else if(playerChoice == 2){
                if(computerChoice == 1){
                    cnt01++;
                    System.out.println("Player wins " + cnt01 + " time(s)\n");
                }else{
                cnt02++;
                System.out.println("Computer wins " + cnt02 + " time(s)\n");
                }
            }
            else if(playerChoice == 3){
                if(computerChoice == 1){
                    cnt02++;
                    System.out.println("Computer wins " + cnt02 + " time(s)\n");
                } else{
                cnt01++;
                System.out.println("Player wins " + cnt01 + " time(s) \n");
                }
            }
            if(cnt01 == 3){
                System.out.println("Player wins the game");
                break;
            }
            else if (cnt02 == 3){
                System.out.println("Computer wins the game");
                break;
            }
        }
    }
    
}
