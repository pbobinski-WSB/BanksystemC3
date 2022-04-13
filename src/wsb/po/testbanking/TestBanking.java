package wsb.po.testbanking;

import wsb.po.banking.Account;
import wsb.po.banking.Customer;

public class TestBanking {

    public static void main(String[] args) {

        Customer customer;
        Account account;

        System.out.println("Tworzenie klienta Jane Smith.");
        customer = new Customer("Jane","Smith");
        System.out.println("Utworzono klienta: "+customer);

        System.out.println("Tworzenie konta z saldem 500,00.");
        account = new Account(500);
        System.out.println("Utworzono konto z saldem "+String.format("%.2f",account.getBalance()));
        //sprawdzić w API metodę format

        customer.setAccount(account);
        System.out.println("Utworzono klienta z kontem: "+customer);


        System.out.println("Wypłata 150,00 "+account.withdraw(150));
        System.out.println("Wpłata 22,50 "+account.deposit(22.50));
        System.out.println("Wypłata 47,62 "+ account.withdraw(47.62));

        System.out.println("Wpłata -22,50 "+account.deposit(-22.50));
        System.out.println("Wypłata 4700,62 "+ account.withdraw(4700.62));


        System.out.println("Klient po operacjach: "+customer);

    }

    /*
Tworzenie klienta Jane Smith.
Utworzenie konta z saldem 500,00.
Wypłata 150,00
Wpłata 22,50
Wypłata 47,62
Klient [Smith, Jane] ma saldo 324,88

     */

}
