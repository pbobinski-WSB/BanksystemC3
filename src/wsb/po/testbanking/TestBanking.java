package wsb.po.testbanking;

import wsb.po.banking.Account;
import wsb.po.banking.Bank;
import wsb.po.banking.Customer;

public class TestBanking {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomer("Simms", "Jane");
        bank.addCustomer("Bryant", "Owen");
        bank.addCustomer("Soley", "Tim");
        bank.addCustomer("Soley", "Maria");

        Account account = new Account(500);
        bank.getCustomer(0).addAccount(account);
        account = new Account(200);
        bank.getCustomer(0).addAccount(account);
        account = new Account(200);
        bank.getCustomer(1).addAccount(account);
        account = new Account(1500);
        bank.getCustomer(2).addAccount(account);
        account = new Account(200);
        bank.getCustomer(2).addAccount(account);
        account = new Account(200);
        bank.getCustomer(2).addAccount(account);
        account = new Account(200);
        bank.getCustomer(3).addAccount(account);
        account = new Account(150);
        bank.getCustomer(3).addAccount(account);


        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            System.out.println("Customer ["+(i+1)+"] is "+bank.getCustomer(i));
            for (int j = 0; j < bank.getCustomer(i).getNumberOfAccounts(); j++) {
                System.out.println("\tAccount "+(j+1)+" "+bank.getCustomer(i).getAccount(j));
            }
        }


    }

    /*
Customer: Simms, Jane
    Account 1: current balance is ¤ 500.00
    Account 2: current balance is ¤ 200.00
Customer: Bryant, Owen
    Account 1: current balance is ¤ 200.00
Customer: Soley, Tim
    Account 1: current balance is ¤ 1,500.00
    Account 2: current balance is ¤ 200.00
    Account 3: current balance is ¤ 200.00
Customer: Soley, Maria
    Account 1: current balance is ¤ 200.00
    Account 2: current balance is ¤ 150.00
     */

}
