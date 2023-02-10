
package Y2020_1;

public class Q5 {
    static CloudPackage [] packageName = new CloudPackage[4];
    public static void main(String[] args) {
        Job J1 = new Job("J1", 252, 20);
        Job J2 = new Job("J2", 108, 10);
        Job J3 = new Job("J3", 72, 25);
        packageName[0] = new CloudPackage("P2-15",4, 15, 1.24);
        packageName[1] = new CloudPackage("P2-30",6, 30, 2.11);
        packageName[2] = new CloudPackage("R5-20",4, 20, 1.38);
        packageName[3] = new CloudPackage("R6-20",6, 20, 1.88);
        System.out.println(J1);
        System.out.println(packageName[getLowestCost(J1)]);
        System.out.println(J2);
        System.out.println(packageName[getLowestCost(J2)]);
        System.out.println(J3);
        System.out.println(packageName[getLowestCost(J3)]);
        System.out.println("");
        System.out.println("Total cost: " + Cloud.overallCost);
        
        
    }
    public static int getLowestCost(Job job){
        int index =0;
        boolean [] check = new boolean[4];
        for(int i =0; i<packageName.length; i++){
            if(packageName[i].check(job) == true){
                check[i] = true;
                index = i;
            }
        }
        for(int i =0; i<packageName.length; i++){
            if((packageName[i].totalCost(job) < packageName[index].totalCost(job)) && check[i])
                index = i;
        }
        return index;
    }
    
}
