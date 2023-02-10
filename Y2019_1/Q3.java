
package Y2019_1;
import java.util.Scanner;
import java.util.Random;
public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        int [][] A = new int [N][N];
        int [][] B = new int [N][N];
        System.out.println("\nMatrix A");
        generateMatrix(A);
        System.out.println("\nMAtrix B");
        generateMatrix(B);
        System.out.println("\nadd");
        generateMatrix(addMatrix(A,B));
        System.out.println("\nmultiply");
        generateMatrix(multiplyMatrix(A,B));
    }
    public static void generateMatrix(int[][] N){
        Random g = new Random();
        
        for(int i =0; i<N.length; i++){
            for(int j =0; j<N[i].length; j++)
                N[i][j] = g.nextInt(9)+0;
        }
            
        
        for(int i =0; i<N.length; i++){
            for(int j =0; j<N.length; j++){
                System.out.print(N[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static int [][] addMatrix (int[][]A, int[][] B){
        int [][] sumMatrix = new int [A.length][A.length];
        for(int i =0; i<sumMatrix.length; i++){
            for(int j =0; j<sumMatrix[i].length; j++)
                sumMatrix[i][j] = A[i][j] + B[i][j];
        }
        return sumMatrix;
    }
    public static int [][] multiplyMatrix(int[][]A, int[][]B){
        int [][] multiplyMatrix = new int[A.length][B.length];
        for(int i =0; i<A.length; i++){
            for(int j =0; j<B.length; j++){
                for(int k =0; k<B.length; k++)
                    multiplyMatrix[i][j] += A[i][k] * B[k][j];
            }       
        }
        return multiplyMatrix;
    }
    
}
