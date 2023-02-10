
package Y2019_1;
import java.io.*;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner (new FileInputStream("C:\\Users\\SJ\\Desktop\\pyq fop txt\\myAmbition.txt"));
            int count01=0, count02=0;
            int [] count = new int [26];
            char [] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H','I', 'J', 'K', 'L', 'M', 'N', 'O', 'P','Q', 'R', 'S','T','U','V', 'W', 'X', 'Y', 'Z'};
            while(sc.hasNextLine()){
                String text = sc.nextLine();
                String [] sentences = text.split("[.]");
                String [] words = text.split(" ");
                for(int i =0; i<sentences.length; i++){
                    count01++;
                }
                for(int i =0; i<words.length; i++){
                    count02++;
                }
                
                System.out.println("Number of sentences: " + count01);
                System.out.println("Number of words: " + count02);
                for(int i =0; i<text.length(); i++){
                    String str = String.valueOf(text.charAt(i));
                    for(int j =0; j< alphabet.length; j++){
                        if(str.compareToIgnoreCase(String.valueOf(alphabet[j])) ==0)
                            count[j]++;
                    }
                }
                for(int i =0; i<alphabet.length; i++){
                    System.out.print(alphabet[i]+" : " + count[i] +" ");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
}
