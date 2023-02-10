
package Y2020_1;

public class Cloud {
    protected String packageName;
    protected double totalCost;
    protected static double overallCost = 0;

    public Cloud(String packageName) {
        this.packageName = packageName;
    }

    public double getTotalCost() {
        return totalCost;
    }
    @Override
    public String toString(){
        overallCost += totalCost;
        return "Cloud Package: "+ packageName + "  Total Cost = "+ totalCost;
    }
}
