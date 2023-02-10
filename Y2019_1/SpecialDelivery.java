
package Y2019_1;

public class SpecialDelivery extends Delivery {
    protected boolean weekend;
    protected boolean nighttime;

    public SpecialDelivery(boolean weekend, boolean nighttime, String sender, String recipient, double weight) {
        super(sender, recipient, weight);
        this.weekend = weekend;
        this.nighttime = nighttime;
    }

    
    public double totalCost(){
        double cost = super.totalCost();
        double total =0;

        if(weekend == true && nighttime == true)
            return total = (cost+ 50)*1.2;
        else if(weekend == true && nighttime == false)
            return total = cost + 50;
        else if(weekend == false && nighttime == true)
            return total = cost*1.2;
        else
            return total = cost;   
    }
    
    @Override
    public String toString(){
        String weekendstr = weekend? "\nweekend delivery ":"";
        String nighttimestr = nighttime? "\nNight time delivery":"";
        return "From: " + sender + " To: " + recipient + "\nWeight of the package: " + weight +" kg" 
                + "\nshipping cost: RM" + totalCost() + weekendstr + nighttimestr;
    }
}
