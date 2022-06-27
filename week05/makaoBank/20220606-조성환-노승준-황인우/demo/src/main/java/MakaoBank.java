// 이 프로그램의 수행 과정?
// - 입력: 거래내역을 씨에스븨 파일로 받음
// - 처리: 받은 파일을 읽어서 거래내역에 맞는 잔액을 계산해 결과를 문자열로 저장
// - 출력: 문자열들을 다시 씨에스븨 파일로 추출
//
//입력은 다음과 같음
//잔액,1000
//입금,500
//출금,300
//출금,150
//
//출력은 다음과 같음
//잔액,1000,1000
//입금,500,1500
//출금,300,1200
//출금,150,1050


import models.Account;
import models.Transaction;

import java.util.List;

public class MakaoBank {
    public static void main(String[] args){
        MakaoBank makaoBank = new MakaoBank();
        makaoBank.run();
    }

    private void run() {

        // 입력
        Account account = new Account();
        List<Transaction> transactionsList = account.loadTransactions();

        // 처리
//        List<TransactionResult> transactionsResultList = process(transactionsList);

        // 출력
//        saveTransactionsResult(transactionsResultList);
    }

}
