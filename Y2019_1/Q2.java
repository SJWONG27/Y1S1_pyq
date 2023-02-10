
package Y2019_1;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String genome;
        String gene;
        boolean found = false;
        int start =-1;  // if start with 0, means the first alphabet is fucking taken
        do{
            System.out.print("Enter genome string [quit to stop]: ");
            genome = sc.nextLine();
            
            for(int i=0; i<genome.length() -2; i++){
                String triplet = genome.substring(i, i+3);
                if(triplet.equals("ATG"))
                    start = i + 3;
                else if((triplet.equals("TAG") || triplet.equals("TAA") || triplet.equals("TGA")) && start!=-1){
                    try{
                        gene = genome.substring(start, i);
                    } catch(StringIndexOutOfBoundsException e){
                        continue;
                    }
                    if (gene.length() % 3 == 0) {
                        found = true;
                        System.out.println(gene);
                        start = -1;
                    }
                }      
            }
            if(!found || genome.equals("")){
                System.out.println("no gene is found");
            }
        }while(!genome.equals("quit"));
    }
    
}
