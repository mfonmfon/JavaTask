import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServerTest {
    Server serve = new Server();

    @Test
    void testThatServerCanBeTurnedOff(){
        Assertions.assertTrue(serve.switchServerOff());
    }
    @Test
    void testThatTransactionsCanNotBeRepeatedWhenTheServerIsOff(){
        Server serve = new Server();
        serve.switchServerOn();
        Assertions.assertTrue(serve.transactionIsRepeated);
    }
    @Test
    void testThatTransactionCanNotBeStoredWhenTheServerIsOff(){
        Server serve = new Server();
        serve.switchServerOn();
        Assertions.assertTrue(serve.transactionsStored);
    }
    @Test
    void testThatTransactionsCanNotBeNumberedWhenTheServerIsOff(){
        Server serve = new Server();
        serve.switchServerOn();
        Assertions.assertTrue(serve.transactionsNumbered);
    }

}
