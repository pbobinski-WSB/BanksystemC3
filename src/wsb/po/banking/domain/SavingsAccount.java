package wsb.po.banking.domain;

public class SavingsAccount extends Account {

    private double interestRate = 0;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return super.toString() + " savings ir = "+interestRate;
    }
}
