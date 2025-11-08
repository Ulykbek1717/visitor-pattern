package assik8;

public class CreditAccount implements  Account{
    double debt;

    CreditAccount(double debt) {
        this.debt = debt;
    }

    @Override
    public void accept(AccountVisitor visitor) {
        visitor.visit(this);
    }
}
