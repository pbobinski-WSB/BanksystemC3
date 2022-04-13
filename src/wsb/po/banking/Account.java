package wsb.po.banking;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit (double amount) {
        if (amount < 0) {
            return false;
        }
        balance += amount; // balance = balance + amount
        return true;
    }

    public boolean withdraw (double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount; // balance = balance - amount
        return true;
    }

    @Override
    public String toString() {
        return "Konto z saldem=" + String.format("%.2f",balance);
    }
}
