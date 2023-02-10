
package Y2016_1;

public class CreditClass {
    public String name;
    public String nocard;
    public char typeCard;
    public CreditClass(String name, String nocard, char typeCard) {
        this.name = name;
        this.nocard = nocard;
        this.typeCard = typeCard;
    }
    public double reward;
    public double getReward(){
        return reward;
    }
    public void setReward(double reward){
        this.reward = reward;
    }
    @Override
    public String toString(){
        if(typeCard == 'C')
            return "Credit Card: " + name + " (" + nocard + ") \n" + "Card Type: Cash Rebate \n" + "Total Cash Reward: RM"+ reward;
        else if(typeCard == 'P')
            return "Credit Card: " + name + " (" + nocard + ") \n" + "Card Type: Point Reward \n" + "Total Cash Reward: RM"+ reward;
        return "This is not a valid card type.\n";
    }
}
