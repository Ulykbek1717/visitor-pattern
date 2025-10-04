package assik4;
public abstract class PaymentProcessor {
    protected Account account;
    
    public PaymentProcessor(Account account) {

        this.account = account;
    }
    
    public abstract void processPayment(double amount);
}
