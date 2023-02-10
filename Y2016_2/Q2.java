package Y2016_2;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 100: ");
        int num = sc.nextInt();
        int digit = 0, sum = 0;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            num = num /10;
        }
        System.out.println(sum);
    }

}
