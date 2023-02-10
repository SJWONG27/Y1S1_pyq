package Y2018_1;

public class Apple extends Fruit{
    private final int quantity;
    protected double price;

    public Apple(int quantity, String name, String type) {
        super(name,type);
        this.quantity = quantity;
    }
    @Override
    public double totalPrice(){
        if(name.equals("apple") && type.equals("red")){
            return price = quantity*1.8;
        }
        else if (name.equals("apple") && type.equals("green")){
            return price = quantity*1.2;
        }
        else
            System.out.println("retype");
        return price;
    }
    @Override
    public String toString(){
        return type + " "+ name + " - " + quantity + " = RM " + totalPrice() ;
    }
}
