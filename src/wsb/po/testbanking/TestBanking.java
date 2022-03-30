package wsb.po.testbanking;

import wsb.po.banking.Account;

public class TestBanking {

    public static void main(String[] args) {

        System.out.println("Tworzenie konta z saldem 500,00.");
        Account account = new Account(500);
        System.out.println("Utworzono konto z saldem "+String.format("%.2f",account.getBalance()));
        //sprawdzić w API metodę format

        System.out.println("Wypłata 150,00");
        account.withdraw(150);
        System.out.println("Wpłata 22,50");
        account.deposit(22.50);
        System.out.println("Wypłata 47,62");
        account.withdraw(47.62);
        System.out.println("Saldo na koncie: "+String.format("%.2f",account.getBalance()));

    }

    /*
W programie testowym utwórz konto z początkowym saldem, przeprowadź kilka operacji wpłat i wypłat, wypisz stan konta, wynik działania programu może być np. Taki:

Tworzenie konta z saldem 500,00.
Wypłata 150,00
Wpłata 22,50
Wypłata 47,62
Saldo na koncie 324,88
     */

}
