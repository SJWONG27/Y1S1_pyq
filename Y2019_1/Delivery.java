
package Y2019_1;

public class Delivery {
    protected String sender;
    protected String recipient;
    protected double weight;
   

    public Delivery(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }
    public double totalCost(){
        double totalCost =0;
        if(weight <= 5)
             return totalCost = weight*2.8;
         else if(weight<=20 && weight>5)
             return totalCost =  5*2.8 + (weight-5)*5.2 ;
         else if(weight<=50 && weight>20)
             return totalCost = 5*2.8 + 15*5.2 + (weight-20)*7;
         else if (weight>50)
             return totalCost = 5*2.8 + 15*5.2 + 30*7 + (weight-50)*8.6 ;  
         return totalCost;
    }
    @Override
    public String toString(){
        return "From: " + sender + " To: " + recipient + "\nWeight of the package: " + weight +" kg" ;
    }
}
