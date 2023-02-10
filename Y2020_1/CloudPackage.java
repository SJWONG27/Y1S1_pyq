
package Y2020_1;

public class CloudPackage extends Cloud {
    private int numCore;
    private int memory;
    protected double pricePerHour;

    public CloudPackage(String packageName, int numCore, int memory, double pricePerHour) {
        super(packageName);
        this.numCore = numCore;
        this.memory = memory;
        this.pricePerHour = pricePerHour;
    }
    public boolean check(Job job){
        if(memory >= job.getMemory())
            return true;
        return false;
    }
    public double totalCost(Job job){
        totalCost=0;
        if(check(job))
            totalCost = (job.getTask()*pricePerHour) / numCore;
        
        return totalCost;
    }
    
}
