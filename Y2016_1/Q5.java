
package Y2016_1;

public class Q5 {

    public static void main(String[] args) {
        Rebate r = new Rebate("John Lee", "1111222233334444");
        Point p = new Point("John Lee", "5555666677778888");
        String [] type = {"grocery","other","fuel","utility","other"};
        String [] day = {"Saturday","Friday","Sunday","Friday","Tuesday"};
        double [] price = {124.80, 64.60, 95.40, 100.00, 220.00};
        double rRebate = r.getReward(type, price);
        double pPoint = p.getReward(day, price);
        System.out.println(r);
        System.out.println("");
        System.out.println(p);
        System.out.println("");
        
        if(rRebate > pPoint)
            System.out.println("The best card is cash rebate card");
        else if(rRebate< pPoint)
            System.out.println("The best card is point reward card");
        else
            System.out.println("Both card same");
    }
    
}
