package wsb.po.banking.reports;

import wsb.po.banking.domain.Bank;

public class CustomerReport {

    public void generateRepotr() {

        Bank bank = Bank.getBank();

        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            System.out.println("Customer ["+(i+1)+"] is "+bank.getCustomer(i));
            for (int j = 0; j < bank.getCustomer(i).getNumberOfAccounts(); j++) {
                System.out.println("\tAccount "+(j+1)+" "+bank.getCustomer(i).getAccount(j));
            }
        }

    }

}
