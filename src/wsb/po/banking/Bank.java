package wsb.po.banking;

public class Bank {

    private Customer [] customers = new Customer[10];

    private int numberOfCustomers = 0;

    public Bank() {
    }

    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f,l);
        customers[numberOfCustomers] = customer;
        numberOfCustomers++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int i) {
        if (i >= numberOfCustomers) {
            return null;
        }
        return customers[i];
    }
}
