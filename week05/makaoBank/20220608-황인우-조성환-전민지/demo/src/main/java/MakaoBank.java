//프로세스: 입력 >> 처리 >> 출력
//입력: 입출금 내역을 가지고 있는 파일을 받아온다.
//처리: 받아온 파일을 처리해서 결과를 만든다.
//출력: 만들어진 결과를 결과 파일로 만들어준다.
//
// 만들어야 할 것 -> 계좌, 거래내역, 처리한 거래내역
// 선택의 시간(거래내역을 따로 저장하고 그걸 계좌로 불러오거나)

import models.Account;
import models.Transaction;
import models.TransactionResult;

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
        //준비 + input
        Account account = new Account();

        List<Transaction> transactions = loadTransactions();

        //process
        List<TransactionResult> transactionResults = account.process(transactions);

        //output
        //saveTransactionResults(transactionResultList);
    }

    public List<Transaction> loadTransactions() throws FileNotFoundException {
        List<Transaction> transactions = new ArrayList<>();

        File file = new File("Input.csv");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split(",");
            transactions.add(new Transaction(words[0], Integer.parseInt(words[1])));
        }

        return transactions;
    }
}
