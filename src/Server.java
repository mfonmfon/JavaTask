public class Server {
    // Write a function that switches an application server(ON and OFF).
    // Given that the application does 3 things.
    // 1) Transactions are repeated every 10seconds.
    // 2) Each transaction are being recorded and stored.
    //3) Transactions are being numbered.

    boolean transactionIsRepeated, transactionsStored, transactionsNumbered;

    public Server() {
        transactionIsRepeated = true;
        transactionsNumbered = true;
        transactionsStored = true;
    }

    public boolean switchServerOff() {
        transactionIsRepeated = false;
        transactionsNumbered = false;
        transactionsStored = false;
        return true;
    }

    public boolean switchServerOn() {
        transactionIsRepeated = true;
        transactionsNumbered = true;
        transactionsStored = true;
        return true;
    }
    public boolean repeatTransaction() {
        if (switchServerOn()) {
          transactionIsRepeated = true;
        }
        return true;
    }
    public boolean recordAndStoreTransactions(){
        if(switchServerOn()){
         transactionsStored = true;
         }
        return true;
    }
    public boolean setTransactionsNumbered(){
        if(switchServerOn()){
            transactionsNumbered = true;
        }
        return  true;
    }
}
