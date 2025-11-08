package assik8;

public class Calculator implements AccountVisitor {

    @Override
    public void visit(SavingsAccount account) {
        double interest = account.balance * 0.04;
        System.out.println("Savings  Balance: " + interest);
    }

    @Override
    public void visit(CreditAccount account) {
        double interest = account.debt * 0.05;
        System.out.println("Credit Debt: " + interest);
    }

}
