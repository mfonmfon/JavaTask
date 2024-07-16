package BankApp;

import java.util.ArrayList;

public class Bank {
    private final ArrayList<Account> accounts = new ArrayList<>();
    private int numberOfCustomers;

    public void addCustomers(String accountName, String phoneNumber, String pin){
        String accountNumber = generateAccountNumbers(phoneNumber);
        Account account = new Account(accountName, accountNumber, pin);
        accounts.add(account);
    }
    public int getNumberOfCustomers(){
        return accounts.size();
    }
    public String generateAccountNumbers(String phoneNumber){
        phoneNumber = phoneNumber.substring(1);
        return phoneNumber;
    }
    public Account findAccountByAccountNumberAndAccountName(String accountNumber){
        for(Account account : accounts){
            boolean accountMatches = account.getAccountNumber().matches(accountNumber);
            if (accountMatches){
                return account;
            }
        }
        throw new IllegalArgumentException("Account not found");
    }
    public Account findAccountByAccountName(String accountName){
        for (Account account : accounts){
            boolean accountFound = account.getAccountName().matches(accountName);
            if (accountFound){
                return  account;
            }
        }
        throw new IllegalArgumentException("Account not found");
    }
    public int checkBalance(String accountNumber, int amount){
        Account account = findAccountByAccountNumberAndAccountName(accountNumber);
        if (account.checkBalance() >= amount){
            account.withdraw(amount);
        }
        throw new IllegalArgumentException("Insufficient Fund");
    }
    public void deposit(String accountNumber, String accountName, String pin, int amount){
        Account account = findAccountByAccountNumberAndAccountName(accountName);
        account.deposit(amount);
    }
    public void withdrawFrom(String accountNumber, int amount){
        Account account = findAccountByAccountNumberAndAccountName(accountNumber);
        account.withdraw(amount);
    }
}