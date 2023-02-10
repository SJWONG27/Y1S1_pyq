
package Y2016_1;

public class Rebate extends CreditClass {
    
    public Rebate(String name, String nocard) {
        super(name, nocard, 'C');
    }
    public double getReward(String[] type, double[] price){
        double cashRebate = 0;
        for(int i =0; i<type.length; i++){
            switch(type[i]){
                case "fuel": 
                    if(price[i]>100) cashRebate += price[i]*0.08 + 8;                       
                    else cashRebate += price[i]*0.08;
                    break;
                case "utility": cashRebate += price[i]*0.05; break;
                case "grocery": cashRebate += price[i]*0.02; break;
                default: cashRebate += price[i]*0.002; break;
            }
        }
        reward = cashRebate;
        return cashRebate;
    }
}
