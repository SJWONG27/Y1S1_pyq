package Y2017_2;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teams: ");
        int N = sc.nextInt();
        //int N = n+1;
        String[] name = new String[N];
        int[] score = new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.print("Enter team " + (i+1) + " name: ");
            name[i] = sc.next();
            sc.nextLine();
            System.out.print("Enter team " + (i+1) + " score: ");
            score[i] = sc.nextInt(); 
        }
        
        for(int pass =1; pass<score.length; pass++){
            for(int i =0; i<score.length-1; i++)
                if(score[i] < score[i+1]){
                    int hold = score[i];
                    score[i] = score[i+1];
                    score[i+1] = hold;
                    
                    String temp = name[i];
                    name [i] = name[i+1];
                    name[i+1] = temp;
                }
        }
        for(int i =0; i<score.length; i++){
            System.out.print(name[i]+" ("+ score[i]+") | ");
        }
        
    }

}
