package BankApp;

public class Account {

    private String accountNumber;
    private int balance;
    private String accountName;
    private String pin;

    public Account(String accountName, String accountNumber, String pin){
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountName(){
        return accountName;
    }
    public double checkBalance(){
       return balance;
        }

    public void deposit(int amount){
        if(amount > 0){
            this.balance = balance + amount;
        }
    }
   public void withdraw(int amount){
        if(this.balance >= amount){
            balance -= amount;
        }
   }
}


