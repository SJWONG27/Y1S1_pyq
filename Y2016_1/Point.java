
package Y2016_1;

public class Point extends CreditClass{

    public Point(String name, String nocard) {
        super(name, nocard, 'P');
    }
    public double getReward(String[]day, double[]price){
        double point =0;
        for(int i =0; i<day.length; i++){
            int temp = (int)price[i];
            switch(day[i]){
                case "Saturday": point += (temp/100)*3; break;  
                case "Sunday": point += (temp/100)*4; break;
                default: point += temp/100; break;
            }
        }
        reward = point;
        return point;
    }
}
