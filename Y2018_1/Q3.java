
package Y2018_1;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, format;
        char type;
        System.out.print("Enter font size: ");
        size = sc.nextInt();
        System.out.print("Enter font type: ");
        type = sc.next().charAt(0);
        System.out.print("Enter format [1-vertical, 2- horizontal]: ");
        format = sc.nextInt();
        displayNumber(size,format,type);
    }
    public static void displayNumber(int size, int format, char type){
        if(format == 1){
           for(int i =0; i<size+4 ; i++){
               for(int j =0; j<size+2; j++){
                   if(i==0 || i==2 || i== 4){
                       System.out.print(type);
                   }
                   else{
                       if(j==1){
                           System.out.print(" ");}
                       else{
                           System.out.print("*");}
                   }
                }
              System.out.println("");
            }
    }
}
}
