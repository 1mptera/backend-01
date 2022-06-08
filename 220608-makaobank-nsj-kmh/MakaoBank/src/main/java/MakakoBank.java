import models.Account;
import models.Transaction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakakoBank {
    public static void main(String[] args) throws FileNotFoundException {
        MakakoBank application = new MakakoBank();
        application.run();
    }

    private void run() throws FileNotFoundException {
        // 준비
        Account account = new Account();

        // 입력
        List<Transaction> transactions = loadTransaction();

        // 처리
//        List<transactionResult> transactionResults = account.process(transactions);

        // 출력
//        saveTransactionResult(transactionResults);
    }

    public List<Transaction> loadTransaction() throws FileNotFoundException {
        List<Transaction> transactions = new ArrayList<>();


        File file = new File("input.csv");

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {
            String Line = scanner.nextLine();

            String[] words = Line.split(",");

            Transaction transaction = new Transaction(words[0], Integer.parseInt(words[1]));

            transactions.add(transaction);
        }

        return transactions;
    }
}

