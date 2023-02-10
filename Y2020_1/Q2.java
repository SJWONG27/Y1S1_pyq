
package Y2020_1;
import java.util.Scanner;

public class Q2 {
    static char [] direction = new char [4];
    static String [] degree = new String [4];
    static double [] decimalDegree = new double[4];
    
    public static void main(String[] args) {
        enterDirection();
        convertInput();
        calDistance();
        double distance = calDistance();
        System.out.printf("Location 1 : %.6f Latitude , %.6f Longitude \n" ,decimalDegree[0],decimalDegree[1] );
        System.out.printf("Location 2 : %.6f Latitude , %.6f Longitude \n" ,decimalDegree[2],decimalDegree[3]);
        System.out.printf("Distance : %.2f KM" , distance);
    }
    public static void enterDirection(){
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<4; i++){
            if(i==0)
                System.out.println("Enter location 1");
            else if (i ==2)
                System.out.println("Enter location 2");
            
            System.out.print("Enter Direction: [N, S, E, W]: ");
            direction [i] = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Enter Degree, Minute and Second: ");
            degree[i] = sc.nextLine();
        }
    }
    public static void convertInput(){
        for(int i =0; i<degree.length; i++){
            String [] temp = degree[i].split(" ");
            double minute = Double.parseDouble(temp[1]);
            double second = Double.parseDouble(temp[2]);
            decimalDegree[i] = Double.parseDouble(temp[0]) + (minute*60+second)/3600;
            if(direction[i] == 'S' || direction[i] =='W')
                decimalDegree[i] = decimalDegree[i]* -1;
        }
    }
    public static double calDistance(){
        double a, c,d;
        double lattitude1 = Math.toRadians(decimalDegree[0]);
        double lattitude2 = Math.toRadians(decimalDegree[2]);
        double lattitudeDiff = Math.max(lattitude1, lattitude2) - Math.min(lattitude1, lattitude2);
        double longitudeDiff = Math.toRadians(Math.max(decimalDegree[1], decimalDegree[3])- Math.min(decimalDegree[1], decimalDegree[3]));
        a = Math.sin(lattitudeDiff/2)*Math.sin(lattitudeDiff/2)+ Math.cos(lattitude1)*Math.cos(lattitude2)*Math.sin(longitudeDiff/2)*Math.sin(longitudeDiff/2);
        c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        d = 6371*c;
        return d;
    }
}
