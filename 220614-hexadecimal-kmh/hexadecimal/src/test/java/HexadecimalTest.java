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
/*
    if(hexadecimalNumber2 == 10) {
      hexadecimalChar = hexadecimalCharArrayOver9[0];

    }
    if(hexadecimalNumber2 == 11) {
      hexadecimalChar = hexadecimalCharArrayOver9[1];

    }
    if(hexadecimalNumber2 == 12) {
      hexadecimalChar = hexadecimalCharArrayOver9[2];

    }
    if(hexadecimalNumber2 == 13) {
      hexadecimalChar = hexadecimalCharArrayOver9[3];

    }
    if(hexadecimalNumber2 == 14) {
      hexadecimalChar = hexadecimalCharArrayOver9[4];

    }
    if(hexadecimalNumber2 == 15) {
      hexadecimalChar = hexadecimalCharArrayOver9[5];

    }*/
    for(int i = 10; i < 16; i +=1){
      if(hexadecimalNumber2 == i) {
        hexadecimalChar = hexadecimalCharArrayOver9[i-10];
      }
    }
    assertEquals("C",hexadecimalChar);

  }

}