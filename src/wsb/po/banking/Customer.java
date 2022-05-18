package wsb.po.banking;

import java.util.ArrayList;

public class Customer {

    private final String firsName;
    private final String lastName;

    private ArrayList<Account> accounts = new ArrayList<Account>();



    public int getNumberOfAccounts() {
        return accounts.size();
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public Account getAccount(int i) {
        if (i >= getNumberOfAccounts()) {
            return null;
        }
        return accounts.get(i);
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
                ", number of accounts=" + getNumberOfAccounts() +
                '}';
    }
}
