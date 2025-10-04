package assik4;

public class Main {
    public static void main(String[] args) {
        Account account = new BankAccount(1000.0);
        PaymentProcessor processor = new CreditCardProcessor(account);
        
        processor.processPayment(150.0);

    }
}
