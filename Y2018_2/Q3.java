
package Y2018_2;
import java.io.*;
import java.util.Scanner;


public class Q3 {
    
    public static String [] name = new String [7];
    public static int [] mark = new int [7];
    public static void main(String[] args) {
        readTxt();
        getMin();
        getMax();
        absent();
    }
    public static void readTxt(){
        try{
            Scanner sc = new Scanner (new FileInputStream("C:\\Users\\SJ\\Desktop\\pyq fop txt\\student.txt"));        
            int i =0;

            while(sc.hasNext()){
                name[i] = sc.nextLine();
                mark[i] = sc.nextInt();
                if(sc.hasNext()){
                    sc.nextLine();}
                else
                    break;
                i++;  
            }
            sc.close();
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    public static void getMin(){
        int min = mark[0];
        String p01 = name[0];
        for(int i =0; i<mark.length; i++){
            if(mark[i]<min && mark[i] != -1){
                min = mark[i];
                p01 = name[i];
            }
        }
        System.out.println("The student with lowest mark: "+p01+" " + min);
    }
    public static void getMax(){
        int max = mark[0];
        String p02 = name[0];
        for(int i =0; i<mark.length; i++){
            if(mark[i]> max){
                max = mark[i];
                p02 = name[i];
            }
        }
        System.out.println("The student with highest mark: "+p02+" " + max);
    }
    public static void absent(){
        int count =0;
        for(int i =0; i<mark.length; i++){
            if(mark[i]==-1){
                count++;
            }
        }
        System.out.println("The number of students who absent from the exam: " + count);
    }
  
}
