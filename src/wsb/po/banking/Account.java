package wsb.po.banking;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount) {
        balance += amount; // balance = balance + amount
    }

    public void withdraw (double amount) {
        balance -= amount; // balance = balance - amount
    }

    @Override
    public String toString() {
        return "Konto z saldem=" + String.format("%.2f",balance);
    }
}
