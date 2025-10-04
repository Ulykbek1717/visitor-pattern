package assik4;
public class BankAccount implements Account {
    private double balance;
    
    public BankAccount(double initialBalance) {

        this.balance = initialBalance;
    }
    
    public void deduct(double amount) {
        balance -= amount;
        System.out.println("Deducted " + amount + ". New balance: " + balance);
    }
}
