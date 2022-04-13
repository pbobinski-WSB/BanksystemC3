package wsb.po.banking;

public class Customer {

    private final String firsName;
    private final String lastName;

    private Account [] accounts = new Account[5];

    private int numberOfAccounts = 0;

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void addAccount(Account a) {
        accounts[numberOfAccounts] = a;
        numberOfAccounts++;
    }

    public Account getAccount(int i) {
        if (i >= numberOfAccounts) {
            return null;
        }
        return accounts[i];
    }

    public Customer(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number of accounts=" + numberOfAccounts +
                '}';
    }
}
