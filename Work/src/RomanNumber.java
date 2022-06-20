

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RomanNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("로마 숫자 : ");
    String romaNumber = scanner.nextLine();
    String[] romaNumberList = romaNumber.split("");
    List<Integer> arabiaNumberList = new ArrayList();
    int arabiaNumberSum = 0;


    for (int i = 0; i < romaNumberList.length; i += 1) {
      int arbiaNumber = 0;
      if (romaNumberList[i].equals("I")) {
        arbiaNumber = 1;
      }

      if (romaNumberList[i].equals("V")) {
        arbiaNumber = 5;
      }

      if (romaNumberList[i].equals("X")) {
        arbiaNumber = 10;
      }

      if (romaNumberList[i].equals("L")) {
        arbiaNumber = 50;
      }

      if (romaNumberList[i].equals("C")) {
        arbiaNumber = 100;
      }

      if (romaNumberList[i].equals("D")) {
        arbiaNumber = 500;
      }

      if (romaNumberList[i].equals("M")) {
        arbiaNumber = 1000;
      }

      arabiaNumberSum += arbiaNumber;
      arabiaNumberList.add(arbiaNumber);
    }

    for (int i = 0; i < arabiaNumberList.size() - 1; ++i) {
      if ( arabiaNumberList.get(i) <  arabiaNumberList.get(i + 1)) {
        arabiaNumberSum -=  arabiaNumberList.get(i) * 2;
      }
    }

    System.out.print("아라비아 숫자 :  " + arabiaNumberSum);
  }
}
