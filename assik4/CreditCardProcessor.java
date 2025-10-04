package assik4;
public class CreditCardProcessor extends PaymentProcessor {
    public CreditCardProcessor(Account account) {
        super(account);
    }
    
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: " + amount);
        account.deduct(amount);
    }
}
