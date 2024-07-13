package Practice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BankAccountTest {
    @Test
    public void checkThatAccountBalanceIsWorking(){
        BankAccount myBank = new BankAccount("Mfon", "Mfon", "08123115688");
        myBank.balance();
        assertEquals(1.0, BankAccount.balance());
    }
    @Test
    public void testThatBalance_empty(){
        BankAccount myBank = new BankAccount("Mfon", "Mfon", "08123115688");
        myBank.balance();
        assertEquals(1.0, myBank.balance());
    }
}