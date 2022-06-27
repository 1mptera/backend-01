import java.util.Scanner;

public class RomanNumber {
  public static void main(String[] args) {

    //준비
    Scanner scanner = new Scanner(System.in);

    System.out.println("로마 숫자");

    String totalInput = scanner.nextLine();


    //처리

    int[] romanNumberToArabic = {1, 5, 10, 50, 100, 500, 1000};

    //주어진 문자열 각각 낱개로 나눔
    String[] eachRomanNumber = totalInput.split("");
    // I V X L C D M
    for (int i = 0; i < totalInput.length(); i = 1) {
      for (int z = 0; z < 7; z += 1) {
        if(eachRomanNumber[i].equals(Integer.toString(romanNumberToArabic[z])); {
          System.
        }

      }

    }
  }
   /* if(eachRomanNumber[0].equals("I")) {
      int toArabic = 1;
    }
    if(eachRomanNumber[1].equals("I")) {
      int toArabic = 1;
    }
    if(eachRomanNumber[2].equals("I")) {
      int toArabic = 1;
    }
    if(eachRomanNumber[3].equals("I")) {
      int toArabic = 1;
    }
    if(eachRomanNumber[4].equals("I")) {
      int toArabic = 1;
    }*/
  //...

  //1. 주어진 로마자를 아라비아 숫자로 바꿈

  //2. 바꿔진 숫자들을 나열함.
  //3. 각 주어진 숫자가 뒷수자보다 값이 작으면 빼기 연산자로 처리함
  //4. 주어진 값을 모두 더함


}
