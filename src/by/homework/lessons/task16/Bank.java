package by.homework.lessons.task16;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    private Set<Account> accounts;

    public Bank() {
        this.accounts = new HashSet<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount)
            throws AccountNotFoundException, NotEnoughMoneyException {

        Account fromAccount = findAccount(accountNumberFrom);
        Account toAccount = findAccount(accountNumberTo);

        if (fromAccount == null || toAccount == null) {
            AccountNotFoundException e = new AccountNotFoundException("Account not found");
            e.setErrorCode("not.found.account");
            throw e;
        }

        if (fromAccount.getBalance() < amount) {
            NotEnoughMoneyException e = new NotEnoughMoneyException("Not enough money");
            e.setErrorCode("not.enough.money");
            throw e;
        }

        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);

        System.out.println("Transfer successful");
        System.out.println("From Account: " + fromAccount);
        System.out.println("To Account: " + toAccount);
    }

    private Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

}
