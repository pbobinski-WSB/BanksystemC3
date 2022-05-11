package wsb.po.testbanking;

import wsb.po.banking.CheckingAccount;
import wsb.po.banking.SavingsAccount;

public class TestKont {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(100,10);

        System.out.println(savingsAccount);

        CheckingAccount checkingAccount = new CheckingAccount(200, 100);

        System.out.println(checkingAccount);

        System.out.println(checkingAccount.withdraw(50));
        System.out.println(checkingAccount);
        System.out.println(checkingAccount.withdraw(350));
        System.out.println(checkingAccount);
        System.out.println(checkingAccount.withdraw(200));
        System.out.println(checkingAccount);

    }

}
