// 입력: 입출금 내역 리스트 csv 파일을 읽어옴
// 처리: 입출금 내역 리스트를 계산하여 결과 생성
// 출력: 생성된 결과물을 새로운 csv 파일로 저장

import models.Account;
import models.Transaction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakaoBank {
    public static void main(String[] args) throws FileNotFoundException {
        MakaoBank application = new MakaoBank();
        application.run();
    }

    public void run() throws FileNotFoundException {
        Account account = new Account();

        List<Transaction> transactions = loadTransactions();

//        List<TransactionResult> transactionResults = account.process(transactions);

//        saveTransactionResult(transactionResults);
    }

    public List<Transaction> loadTransactions() throws FileNotFoundException {
        List<Transaction> transactions = new ArrayList<>();

        File inputFile = new File("./src/main/resources/input.csv");

        Scanner fileScanner = new Scanner(inputFile);

        String firstLine = fileScanner.nextLine();
        System.out.println("firstLine: " + firstLine);

        String[] elements = firstLine.split(",");
        for (int i = 0; i < elements.length; i += 1) {
            System.out.println("elements[" + i + "]" + ": " + elements[i]);
        }

        Transaction firstTransaction = new Transaction(elements[0], Integer.parseInt(elements[1]));

        transactions.add(firstTransaction);

        return transactions;
    }
}
