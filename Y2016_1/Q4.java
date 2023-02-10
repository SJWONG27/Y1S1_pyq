
package Y2016_1;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Q4 {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new FileInputStream("C:\\Users\\SJ\\Desktop\\password.txt"));
            Pattern p = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

          while(sc.hasNextLine()){
              int count = 0;
              int upperchar = 0;
              int lowerchar = 0;
              int digit = 0;
              int specialchar =0;
              
              String password = sc.nextLine();
              for(int i =0; i<password.length(); i++){
                  char temp = password.charAt(i);

                  if(isUpperCase(temp))
                      upperchar++;
                  else if(isLowerCase(temp))
                      lowerchar++;
                  else if(Character.isDigit(temp))
                      digit++;
                  else{
                      Matcher m = p.matcher(String.valueOf(temp));
                      boolean b = m.matches();
                      if(b)
                          specialchar++;
                  }
                  count++;
                }
             /* System.out.println();
              System.out.println(password);
              System.out.println("Uppercase: " + upperchar);
              System.out.println("Lowercase: " + lowerchar);
              System.out.println("Number of digit: " + digit);
              System.out.println("Special Character: " + specialchar);
              System.out.println("Number of character in the password : " + count); */

              if(count > 7 && upperchar > 0 && lowerchar >0 && digit > 0 && specialchar > 0){
                  System.out.println("Strong password");
              }else
                  System.out.println("Not a strong password");
        }
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }
}
}
