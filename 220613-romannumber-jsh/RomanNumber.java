// 로마숫자에 대한 각 아라비아 숫자값을 주기
// "I","V","X","L","C","D","M" 에 대해서 아라비아 숫자의 값을 대입해주기
//  로마숫자배열값에 "" 으로 배열의 구분을 해줌
//  작은 숫자가 큰 숫자보다 먼저오는 경우에는  작은 숫자를 큰숫자에 뺴주기
//  CXC = 100 + 10 + 100 -> 100 - 10 + 100


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RomanNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("로마 숫자: ");

    String romanNumber = scanner.nextLine();

    String[] romanNumberList = romanNumber.split("");

    List<Integer> arabiaNumberList = new ArrayList<>();

    int arabiaNumber = 0;
    int arabiaNumberSum = 0;

    for (int i = 0; i < romanNumberList.length; i += 1) {

      if (romanNumberList[i].equals("I")) {
        arabiaNumber = 1;
      }
      if (romanNumberList[i].equals("V")) {
        arabiaNumber = 5;
      }
      if (romanNumberList[i].equals("X")) {
        arabiaNumber = 10;
      }
      if (romanNumberList[i].equals("L")) {
        arabiaNumber = 50;
      }
      if (romanNumberList[i].equals("C")) {
        arabiaNumber = 100;
      }
      if (romanNumberList[i].equals("D")) {
        arabiaNumber = 500;
      }
      if (romanNumberList[i].equals("M")) {
        arabiaNumber = 1000;
      }
      arabiaNumberSum += arabiaNumber;
      arabiaNumberList.add(arabiaNumber);
    }

    for (int i = 0; i < arabiaNumberList.size() - 1; i += 1) {
      if (arabiaNumberList.get(i) < arabiaNumberList.get(i + 1)) {
        arabiaNumberSum -= arabiaNumberList.get(i) * 2;
      }
    }
    System.out.println("아라비아 숫자 :" + arabiaNumberSum);
  }
}
