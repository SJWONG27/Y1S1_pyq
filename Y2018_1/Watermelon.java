
package Y2018_1;

public class Watermelon extends Fruit{
    protected double weight;
    private double price;

    public Watermelon(double weight, String name, String type) {
        super(name, type);
        this.weight = weight;
    }
    @Override
    public double totalPrice(){
        if(type.equalsIgnoreCase("local")){
            if(weight<2)
                return price = weight*2.25;
            else if(weight>=2 && weight<=5)
                return price = weight*1.95;
            else if(weight>5)
                return price = weight*1.65;
        }
        else if(type.equalsIgnoreCase("imported")){
            if(weight<2)
                return price = weight*3.75;
            else if(weight>=2 && weight<=5)
                return price = weight*3.45;
            else if(weight>5)
                return price = weight*3.15;
        }
        return price;
    }
    @Override
    public String toString(){
        return type + " " + name + " - " + weight + " = RM" + totalPrice();
    }
}
