import models.Account;
import models.Transaction;

import java.util.ArrayList;
import java.util.List;

public class MakaoBank {
    public static void main(String[] args) {
        MakaoBank application = new MakaoBank();
        application.run();
    }

    public void run() {
        // prepare
        Account account = new Account();

        // input
        List<Transaction> transactions = loadTransaction();

        // process

//        List<transactionResult> transactionResults = process(transactions);

        // output

//        saveTransactionResult(transactionResults);

    }

    public List<Transaction> loadTransaction() {

        List<Transaction> transactions = new ArrayList<>();

        return transactions;
    }
}
