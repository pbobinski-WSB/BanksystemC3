package wsb.po.testbanking;

import wsb.po.banking.CheckingAccount;
import wsb.po.banking.NegativeDepositException;
import wsb.po.banking.OverdraftException;
import wsb.po.banking.SavingsAccount;

public class TestKont {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(100,10);

        System.out.println(savingsAccount);

        CheckingAccount checkingAccount = new CheckingAccount(100, 100);

        try {
            checkingAccount.deposit(-100);
        } catch (NegativeDepositException ex) {
            System.out.println("Nie można wpłacić ujemnej kwoty");
        }

        System.out.println(checkingAccount);

        try {
            checkingAccount.withdraw(50);
            System.out.println(checkingAccount);
            checkingAccount.withdraw(350);
            System.out.println(checkingAccount);
            checkingAccount.withdraw(200);
            System.out.println(checkingAccount);
        } catch (OverdraftException ex) {
            System.out.println("wyjątek "+ex.toString());
            System.out.println("Przekroczono stan konta o "+ex.getDeficit());

        }

    }

}
