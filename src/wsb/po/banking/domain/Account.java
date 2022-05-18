package wsb.po.banking.domain;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount) throws NegativeDepositException {
        if (amount < 0) {
            throw new NegativeDepositException();
        }
        balance += amount; // balance = balance + amount
    }

    public void withdraw (double amount) throws OverdraftException{
        if (amount > balance) {
            throw new OverdraftException("przekroczono saldo",amount - balance);
        }
        balance -= amount; // balance = balance - amount
    }

    @Override
    public String toString() {
        return "Konto z saldem=" + String.format("%.2f",balance);
    }
}
