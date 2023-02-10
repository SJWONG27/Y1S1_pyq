
package Y2018_1;
import java.io.*;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new FileInputStream("C:\\Users\\SJ\\Desktop\\pyq fop txt\\Q4.txt"));
            double  totalScore =0;
            int difficult =0;
            while(sc.hasNextLine()){
                String input = sc.nextLine();
                String [] input01 = input.split(" ");
                String name = input01[0];
                double score01 = Double.parseDouble(input01[1]);
                double score02 = Double.parseDouble(input01[2]);
                double score03 = Double.parseDouble(input01[3]);
                double score04 = Double.parseDouble(input01[4]);
                double score05 = Double.parseDouble(input01[5]);
                
                double [] score ={score01,score02,score03,score04,score05};
                difficult = Integer.parseInt(input01[6]);
                
                double max = score[0];
                for (int i =0; i<score.length; i++){
                    if(score[i] > max)
                        max = score[i];
                }
                
                double min = score[0];
                for(int i =0; i<score.length; i++){
                    if(score[i] < min)
                        min = score[i];
                }
                
               
                for(int i =0; i<score.length; i++){
                    if(score[i] != min && score[i] != max){
                        totalScore += score[i];
                    }
                }
                System.out.println(name + " score " + totalScore*difficult);
                
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
}
