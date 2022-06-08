//프로세스: 입력 >> 처리 >> 출력
//입력: 입출금 내역을 가지고 있는 파일을 받아온다.
//처리: 받아온 파일을 처리해서 결과를 만든다.
//출력: 만들어진 결과를 결과 파일로 만들어준다.
//
// 만들어야 할 것 -> 계좌, 거래내역, 처리한 거래내역
// 선택의 시간(거래내역을 따로 저장하고 그걸 계좌로 불러오거나)


import models.Account;
import models.Transaction;

import java.util.List;

public class MakaoBank {
    public static void main(String[] args) {
        MakaoBank application = new MakaoBank();
        application.run();
    }

    public void run() {
        //준비 + input
        Account account = new Account();

        List<Transaction> transactions = loadTransactions();

        //process
        //List<TransactionResult> transactionResultList = account.process(transactions);

        //output
        //saveTransactionResults(transactionResultList);
    }

    public List<Transaction> loadTransactions() {
        return null;
    }
}
