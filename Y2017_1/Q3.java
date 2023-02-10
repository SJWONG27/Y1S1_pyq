
package Y2017_1;
import java.io.*;
import java.util.Random;
import java.util.Scanner;


public class Q3 {
    private static String word;
    public static void main(String[] args) {
        generateRandom();
        System.out.println("The string generated is : " + word);

        char [] letters = word.toCharArray();
        System.out.println("String sorted in ascending order : " + bubblesort(letters, '>'));

        System.out.println("String sorted in descending order : " + bubblesort(letters, '<'));

        System.out.println("Original String from file : " + readFile());
    }
    public static void generateRandom(){
        StringBuilder str = new StringBuilder();
        Random g= new Random();
        int randomNum =0 ;
        for(int i =0 ; i<6; i++){
            do{
                randomNum = g.nextInt(53)+65;
            } while (! (randomNum>=65 && randomNum<=90) || (randomNum>=97 && randomNum<=122));
            str.append((char)(randomNum));
        }
        word = str.toString();
        writeFile();
    }
    public static void writeFile(){
        try{
            PrintWriter pw = new PrintWriter(new FileOutputStream("data.txt"));
            pw.write(word);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    public static String readFile(){
        try{
            Scanner sc = new Scanner(new FileInputStream("data.txt"));
            return sc.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return "";
    }
    public static String bubblesort(char[]str, char arrange){
        for(int pass =1; pass<str.length; pass++){
            for(int i =0; i<str.length-1 ; i++){
                if(arrange == '>'){
                    if(str[i]>str[i+1]){
                        char temp = str[i];
                        str[i] = str[i+1];
                        str[i+1] = temp;
                    }
                }
                else if(arrange == '<'){
                    if(str[i]< str[i+1]){
                        char temp = str[i];
                        str[i] = str[i+1];
                        str[i+1] = temp;
                    }
                }
        }
        }
        return String.valueOf(str);
    }
}
