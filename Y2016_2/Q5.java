
package Y2016_2;
import java.util.Random;

public class Q5 {

    public static void main(String[] args) {
        Random g = new Random();
        int row =0, column =0;
        int [][] arr = new int[3][3];
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++)
                arr[i][j]=g.nextInt(2)+0;
        }
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
                if(arr[0][j] == 1 && arr[1][j] == 1 && arr[2][j] ==1)
                    column++;
            }
            if(arr[i][0] == 1 && arr[i][1] == 1 && arr[i][2] ==1)
                row++;
            System.out.println("");
        }
        System.out.println("All 1s on row " + row);
        System.out.println("All 1s on column " + column/3);
    }
    
}
