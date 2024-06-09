package Practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void checkThatAccountBalanceIsWorking(){
        BankAccount myBank = new BankAccount();
        BankAccount.createAccount();

    }

}