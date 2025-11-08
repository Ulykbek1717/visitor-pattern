package assik8;

interface AccountVisitor {
    void visit(SavingsAccount account);
    void visit(CreditAccount account);
}
