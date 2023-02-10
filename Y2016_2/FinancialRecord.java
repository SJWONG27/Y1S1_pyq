
package Y2016_2;

public class FinancialRecord {
    private int id =0;
    private double balance =0;
    private double annualInterestRate =0;

    public FinancialRecord() {}

    public FinancialRecord(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlyInterestRate(double annualInterestRate){
        double month = annualInterestRate /12;
        return month;
    }
    public double withdraw(double withdraw){
        balance = balance - withdraw;
        return balance;
    }
    public double deposit(double deposit){
        balance = balance + deposit;
        return balance;
    }

    public void displayRecordInfo(){
        System.out.println("Financial record id is: " + id);
        System.out.println("Financial record balance is: RM" + balance);
    }  
}
