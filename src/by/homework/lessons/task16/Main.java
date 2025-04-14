package by.homework.lessons.task16;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1, "BY20 OLMP 3135 0000 0010 0000 0933", "BYN", 15000.00);
        Account account2 = new Account(2, "BY20 OLMP 4456 0000 0010 0000 0907", "BYN", 180.50);
        Account account3 = new Account(3, "BY88 AKBB 3819 3821 0001 3000 0000", "BYN", 265500.00);
        Account account4 = new Account(4, "BY90 AKBB 8199 1666 0000 9000 0000", "BYN", 12100.80);
        Account account5 = new Account(5, "BY42 AKBB 3819 3821 0002 9000 0000", "BYN", 1078.10);

        Bank bank = new Bank();
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);

        try {
            bank.transferMoney("BY88 AKBB 3819 3821 0001 3000 0000", "BY20 OLMP 4456 0000 0010 0000 0907", 500.00);
        } catch (AccountNotFoundException e) {
            if (e.getErrorCode().equals("not.found.account")) {
                System.out.println("Откройте счёт в нашем банке для выполнения переводов");
            }
        } catch (NotEnoughMoneyException e) {
            if (e.getErrorCode().equals("not.enough.money")) {
                System.out.println("Недостаточно средств для перевода");
            }
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка");
        }
    }

}
