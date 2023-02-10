
package Y2018_1;
public class Q5 {

    public static void main(String[] args) {
        Apple a = new Apple(8, "apple", "red");
        System.out.println(a);
        Apple b = new Apple(11, "apple", "green");
        System.out.println(b);
        
        Watermelon c = new Watermelon(7.6, "watermelon", "local");
        System.out.println(c);
        Watermelon d = new Watermelon(4.0, "watermelon", "imported");
        System.out.println(d);
        
        double [] price = {a.totalPrice(),b.totalPrice(),c.totalPrice(),d.totalPrice()};
        double min = price[0];
        for (int i =0; i<price.length; i++){
            if(price[i]<min)
                min = price[i];
        }
        System.out.println("The cheapest price is: RM" + min);
    }
    
}
