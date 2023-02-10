
package Y2016_1;
import java.util.Random;

public class Q3 {
    public static Random g = new Random();
    public static void main(String[] args) {
        int [] num = new int[6];
        displayInteger(num);
        displayMax(num);
        round(num);
        reverse(num);
    }
    public static void displayInteger(int[]arr){
        System.out.print("The random integer : ");
        for(int i =0; i<arr.length; i++){
            arr[i]= g.nextInt(1001)+0;
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void displayMax (int[] arr){
        int max =0;
        System.out.print("The maximum number :");
        for(int i =0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        System.out.print(" " + max +"\n");
    }
    public static void round(int[] arr){
        System.out.print("The approximation of integer to the nearest tenth: ");
        for(int i =0; i<arr.length ; i++){
            int temp = (int)Math.round(arr[i]/10)*10;
            System.out.print(temp +" ");
        }
        System.out.println("");
    }
    public static void reverse(int[]arr){
        System.out.print("The random integer in reverse order : ");
        for(int i = 0; i<arr.length; i++){
            String numStr = String.valueOf(arr[i]);

            for(int j = numStr.length() - 1; j>=0; j--)
                System.out.print(numStr.charAt(j));


            System.out.print(" ");
        }

        System.out.println();
    }
}
