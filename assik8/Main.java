package assik8;

public class Main {
    public static void main(String[] args) {
        Account[] accounts = {
                new SavingsAccount(1500.0),
                new CreditAccount(500.0)
        };

        Calculator calculator = new Calculator();
        for (Account account : accounts) {
            account.accept(calculator);
        }
    }
}
