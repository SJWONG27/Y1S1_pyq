
package Y2016_2;

public class Q6 {

    public static void main(String[] args) {
        FinancialRecord b = new FinancialRecord(1234,10000);
        b.displayRecordInfo();
        System.out.println("Annual interest rate is 7.77");
        System.out.println("");
        
        FinancialRecord a = new FinancialRecord(1235,20000);
        int deposit = 1500;
        int withdraw = 500;
        double interest =8.0;
        a.displayRecordInfo();
        System.out.println("Annual interest rate is: " + interest);
        System.out.println("The monthly interest rate is: "+a.getMonthlyInterestRate(interest));
        System.out.println("Previous balance: " + a.getBalance());
        System.out.println("Current balance after deposit of RM"+deposit+" is: RM"+a.deposit(deposit));
        System.out.println("Previous balnce: RM" + (a.deposit(0)) );
        System.out.println("Current balance after withdrawal of RM"+ withdraw+" is: RM"+a.withdraw(withdraw));
    }
    
}
