import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {
  @Test
  void example1() {
    // 0을 넣으면 0이 출력되는 간단 테스트
    // 어떻게??
    //16진수라는 것은 주어진 10진수를 16이라는 수로 나누었을때 나머지를 역순으로 출력한 것.
    //0을 16으로 나눈 나머지는?
    int hexadecimalNumber1 = 0 % 16;
    assertEquals(0,hexadecimalNumber1);
    //통과
  }

  @Test
  void example2() {
    //12를 넣었을때 나머지가 12이고 문자열 C로 변환되어야함
    int hexadecimalNumber2 = 12 % 16;

    String[] hexadecimalCharArrayOver9 = new String[] {"A","B","C","D","E","F"};

    String hexadecimalChar = "";

    for(int i = 10; i < 16; i +=1){
      if(hexadecimalNumber2 == i) {
        hexadecimalChar = hexadecimalCharArrayOver9[i-10];
      }
    }
    assertEquals("C",hexadecimalChar);

  }

  @Test
  void example3() {
    //이그잼플2와 비슷하므로 그대로 복사해서 가져오기
    int hexadecimalNumber3 = 10 % 16;

    String[] hexadecimalCharArrayOver9 = new String[] {"A","B","C","D","E","F"};

    String hexadecimalChar = "";

    for(int i = 10; i < 16; i +=1){
      if(hexadecimalNumber3 == i) {
        hexadecimalChar = hexadecimalCharArrayOver9[i-10];
      }
    }
    assertEquals("A",hexadecimalChar);

  }

  @Test
  void example4() {
    int decimalNumber = 128;
    int divider = 16;
    int hexadecimalNumber4 = 80;
    //128 의 첫 몫 8 나머지 0 그 다음 몫 0 나머지 0
    int quotient1 = decimalNumber / divider;
    int quotient2 = quotient1 % divider;
    int remainder1 = decimalNumber % divider;
    int remainder2 = quotient2 % divider;

    String result = Integer.toString(remainder2) + Integer.toString(remainder1);


    assertEquals("80",result);
  }

  @Test
  void example5() {
    int decimalNumber = 918;
    int divider = 16;
    int hexadecimalNumber4 = 396;
    //918
    int quotient1 = decimalNumber / divider;
    int quotient2 = quotient1 / divider;

    String result = Integer.toString(quotient1) + Integer.toString(quotient2);


    assertEquals("80",result);
  }

}