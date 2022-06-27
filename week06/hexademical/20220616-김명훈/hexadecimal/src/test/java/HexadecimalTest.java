import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {
  @Test
  void case0() {
    //16진수 표현법 = 주어진 10진수를 16으로 계속 나눈 나머지를 역순으로 읽은것

    int inputDecimalNumber = 0;

    int remainder = inputDecimalNumber % 16;

    assertEquals(0,remainder);
  }

  @Test
  void case12() {
    //16진수 표현법 = 주어진 10진수를 16으로 계속 나눈 나머지를 역순으로 읽은것

    int inputDecimalNumber = 12;

    int remainder = inputDecimalNumber % 16;

    char convertedRemainder = 'n';


    //10이상의 수 문자열 변환 필요
    System.out.println("remainder: " + remainder);
    String alphabetForHexadecimal = "ABCDEF";
    if(remainder == 10) {
      convertedRemainder = alphabetForHexadecimal.charAt(0);
    }
    if(remainder == 11) {
      convertedRemainder = alphabetForHexadecimal.charAt(1);
    }
    if(remainder == 12) {
      convertedRemainder = alphabetForHexadecimal.charAt(2);
    }
    if(remainder == 13) {
      convertedRemainder = alphabetForHexadecimal.charAt(3);
    }
    if(remainder == 14) {
      convertedRemainder = alphabetForHexadecimal.charAt(4);
    }
    if(remainder == 15) {
      convertedRemainder = alphabetForHexadecimal.charAt(5);
    }

    assertEquals('C',convertedRemainder);
  }

  @Test
  void case10() {
    //16진수 표현법 = 주어진 10진수를 16으로 계속 나눈 나머지를 역순으로 읽은것

    int inputDecimalNumber = 10;

    int remainder = inputDecimalNumber % 16;

    char convertedRemainder = 'n';


    //10이상의 수 문자열 변환 필요
    System.out.println("remainder: " + remainder);
    String alphabetForHexadecimal = "ABCDEF";
    if(remainder == 10) {
      convertedRemainder = alphabetForHexadecimal.charAt(0);
    }
    if(remainder == 11) {
      convertedRemainder = alphabetForHexadecimal.charAt(1);
    }
    if(remainder == 12) {
      convertedRemainder = alphabetForHexadecimal.charAt(2);
    }
    if(remainder == 13) {
      convertedRemainder = alphabetForHexadecimal.charAt(3);
    }
    if(remainder == 14) {
      convertedRemainder = alphabetForHexadecimal.charAt(4);
    }
    if(remainder == 15) {
      convertedRemainder = alphabetForHexadecimal.charAt(5);
    }

    assertEquals('A',convertedRemainder);
  }
  @Test
  void case128() {
    //16진수 표현법 = 주어진 10진수를 16으로 계속 나눈 나머지를 역순으로 읽은것

    int inputDecimalNumber = 128;

    int remainder0 = inputDecimalNumber % 16;

    int quotient = inputDecimalNumber / 16;

    int remainder1 = quotient % 16;

    char convertedRemainder = 'n';

    //10이상의 수 문자열 변환 필요
    System.out.println("remainder: " + remainder0);
    String alphabetForHexadecimal = "ABCDEF";
    if(remainder0 == 10) {
      convertedRemainder = alphabetForHexadecimal.charAt(0);
    }
    if(remainder0 == 11) {
      convertedRemainder = alphabetForHexadecimal.charAt(1);
    }
    if(remainder0 == 12) {
      convertedRemainder = alphabetForHexadecimal.charAt(2);
    }
    if(remainder0 == 13) {
      convertedRemainder = alphabetForHexadecimal.charAt(3);
    }
    if(remainder0 == 14) {
      convertedRemainder = alphabetForHexadecimal.charAt(4);
    }
    if(remainder0 == 15) {
      convertedRemainder = alphabetForHexadecimal.charAt(5);
    }
    String result = "" + remainder1 + "" + remainder0;

    assertEquals("80",result);
  }

  @Test
  void case918() {
    //16진수 표현법 = 주어진 10진수를 16으로 계속 나눈 나머지를 역순으로 읽은것

    int inputDecimalNumber = 128;

    int remainder0 = inputDecimalNumber % 16;

    int quotient0 = inputDecimalNumber / 16;

    int remainder1 = quotient0 % 16;

    int quotient1 =

    char convertedRemainder = 'n';

    //10이상의 수 문자열 변환 필요
    System.out.println("remainder: " + remainder0);
    String alphabetForHexadecimal = "ABCDEF";
    if(remainder0 == 10) {
      convertedRemainder = alphabetForHexadecimal.charAt(0);
    }
    if(remainder0 == 11) {
      convertedRemainder = alphabetForHexadecimal.charAt(1);
    }
    if(remainder0 == 12) {
      convertedRemainder = alphabetForHexadecimal.charAt(2);
    }
    if(remainder0 == 13) {
      convertedRemainder = alphabetForHexadecimal.charAt(3);
    }
    if(remainder0 == 14) {
      convertedRemainder = alphabetForHexadecimal.charAt(4);
    }
    if(remainder0 == 15) {
      convertedRemainder = alphabetForHexadecimal.charAt(5);
    }
    String result = "" + remainder1 + "" + remainder0;

    assertEquals("80",result);
  }

}