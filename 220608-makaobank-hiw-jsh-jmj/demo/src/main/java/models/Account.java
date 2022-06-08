// 잔액을 관리하려면 transactionResult를 만들어야 함
// transaction에서 타입과 어마운트를 가져와서 계산을 함
// 계산을 하는 기준은 타입이 뭐냐에 따라서 갈림
// - "잔액"이면 기존 amount 그대로 표시함
// - "출금"이면 기존 amount에서 주어진 amount를 뺌
// - "입금"이면 기존 amount에서 주어진 amount를 더함
// 계산한 결과들을 transactionResult 클래스 형태로 만들어서
// 리스트에 add해줌

package models;

import java.util.List;

public class Account {
    public List<TransactionResult> process(List<Transaction> transactions) {

        return List.of();
    }
    //Todo : 잔액관리

}
