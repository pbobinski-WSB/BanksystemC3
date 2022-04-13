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

        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            System.out.println("Customer ["+(i+1)+"] is "+bank.getCustomer(i));
        }


    }

    /*
Customer [1] is Simms, Jane
Customer [2] is Bryant, Owen
Customer [3] is Soley, Tim
Customer [4] is Soley, Maria
     */

}
