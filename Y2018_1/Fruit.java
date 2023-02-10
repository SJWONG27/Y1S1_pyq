
package Y2018_1;

public abstract class Fruit {
    protected String name;
    protected String type;

    public Fruit(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public abstract double totalPrice();
    
    @Override
    public String toString(){
        return  name + type;
    }
}
