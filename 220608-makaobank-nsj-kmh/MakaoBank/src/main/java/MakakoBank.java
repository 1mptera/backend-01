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

        File file = new File("input.csv");

        Scanner scanner = new Scanner(file);

        String Line = scanner.nextLine();

        System.out.println(Line);

        List<Transaction> transactions = new ArrayList<>();

        return transactions;
    }
}

