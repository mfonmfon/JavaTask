package Practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount myBank = new BankAccount();
    @Test
    public void checkThatAccountBalanceIsWorking(){
        myBank.balance();
        Assertions.assertEquals(BankAccount.balance(0.0));
    }

}