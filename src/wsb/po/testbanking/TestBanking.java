package wsb.po.testbanking;

import wsb.po.banking.*;

public class TestBanking {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomer("Simms", "Jane");
        bank.addCustomer("Bryant", "Owen");
        bank.addCustomer("Soley", "Tim");
        bank.addCustomer("Soley", "Maria");

        CheckingAccount caccount = new CheckingAccount(500);
        bank.getCustomer(0).addAccount(caccount);
        SavingsAccount saccount = new SavingsAccount(200,0);
        bank.getCustomer(0).addAccount(saccount);
        caccount = new CheckingAccount(200,100);
        bank.getCustomer(1).addAccount(caccount);
        saccount = new SavingsAccount(1500,5);
        bank.getCustomer(2).addAccount(saccount);
        caccount = new CheckingAccount(200,50);
        bank.getCustomer(2).addAccount(caccount);
        saccount = new SavingsAccount(200,10);
        bank.getCustomer(2).addAccount(saccount);
        caccount = new CheckingAccount(200);
        bank.getCustomer(3).addAccount(caccount);
        saccount = new SavingsAccount(150,2);
        bank.getCustomer(3).addAccount(saccount);


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
