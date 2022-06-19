import java.util.Scanner;

public class Hexadecimal {
  public static void main(String[] args) {
    //준비, 스캐너 도입
    Scanner scanner = new Scanner(System.in);
    System.out.print("십진수를 입력해주세요: ");
    int input = scanner.nextInt();

    //0 1 2 .... 9 A B C D E F
    //주어진 수를 몫이 0이 될때까지 16으로 나눈다.
    //거기서 생긴 나머지들을 순차적으로 더한다.
    //예시 300 첫번째 몫 18 나머지 12 두번째 몫 1 나머지 2 세번째 몫 0 나머지 1
    // 300의 16진법 1 2 12 -> 문자열 변환 1 2 C
    int quotient = input / 16;
    int firstRemainder = input % 16;
    for (int i = 0; quotient > 0; i += 1) {
      int remainder = quotient % 16;
      quotient = quotient / 16;

      if (remainder == 10) {
        String alphabetOfTen = Integer.toString(remainder);
        alphabetOfTen = "A";
      }
      if (remainder == 11) {
        String alphabetOfTEleven = Integer.toString(remainder);
        alphabetOfTEleven = "B";
      }
      if (remainder == 12) {
        String alphabetOfTwelve = Integer.toString(remainder);
        alphabetOfTwelve = "C";
      }
      if (remainder == 13) {
        String alphabetOfThirteen = Integer.toString(remainder);
        alphabetOfThirteen = "D";
      }
      if (remainder == 14) {
        String alphabetOfFourteen = Integer.toString(remainder);
        alphabetOfFourteen = "E";
      }
      if (remainder == 15) {
          String alphabetOfFifteen = Integer.toString(remainder);
          alphabetOfFifteen = "F";

        }
        System.out.println(remainder);



      String[] reference = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};


//    int firstQuotient = input / 16;
//    int firstRemainder = input % 16;
//
//    int secondQuotient = firstQuotient / 16;
//    int secondRemainder = firstQuotient % 16;
//
//    int thirdQuotienr = secondQuotient / 16;
//    int thirdRemainder = secondQuotient % 16;
//    // ...
      //마지막Remainder + (마지막-1)Remainder .. firstRemainder
      // >> if(**Remainder = 10) -> A
      // >>                   11 -> B
      //   ...                15 -> F

    }
  }
}
