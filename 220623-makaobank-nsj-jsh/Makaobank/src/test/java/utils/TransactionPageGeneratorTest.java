package utils;

import org.junit.jupiter.api.Test;
import utils.PageGenerator;
import utils.TransactionPageGenerator;

import static org.junit.jupiter.api.Assertions.*;

class TransactionPageGeneratorTest {
  @Test
  void creation(){
    PageGenerator pageGenerator = new TransactionPageGenerator();


    String content = pageGenerator.content();
    assertTrue(content.contains("거래 내역"), "거래 내역 문제있음" + content);
    assertTrue(content.contains("joker 송금:500"), "송금 문제있음" + content);
  }

}