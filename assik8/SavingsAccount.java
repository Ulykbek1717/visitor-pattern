package assik8;

public class SavingsAccount implements Account {
    double balance;
    SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void accept(AccountVisitor visitor) {
        visitor.visit(this);
    }

}
