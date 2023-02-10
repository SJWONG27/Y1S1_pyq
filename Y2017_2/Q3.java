package Y2017_2;

import java.util.Random;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of random integer: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        displayInt(arr);
        getMinimum(arr);
        getApprox(arr);
        reverse(arr);
    }

    public static void displayInt(int[] arr) {
        Random g = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = g.nextInt(10000) + 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void getMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum number: " + min);
    }

    public static void getApprox(int[] arr) {
        System.out.print("The approximation of the integer to the nearest hundred: ");
        for (int i = 0; i < arr.length; i++) {
            int temp = (Math.round(arr[i] / 100)) * 100;
            System.out.print(temp + " ");
        }
        System.out.println("");
    }

    public static void reverse(int[] arr) {
        System.out.print("The random integer in reverse order: ");
        for (int i = 0; i < arr.length; i++) {
            String num = String.valueOf(arr[i]);
            for (int j = num.length() - 1; j >= 0; j--) {
                System.out.print(num.charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println("");
    }
}
