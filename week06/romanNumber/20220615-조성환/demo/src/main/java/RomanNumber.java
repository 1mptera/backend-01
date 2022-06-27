
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RomanNumber {
  private int arabiaNumber = 0;

  public static void main(String[] args) {
    RomanNumber application = new RomanNumber();
    application.run();
  }

  public void run() {
    // 준비, 입력
    Scanner scanner = new Scanner(System.in);

    System.out.print("로마 숫자를 입력해주세요");

    String romanNumber = scanner.nextLine();

    int arabiaNumber = convert(romanNumber);

    System.out.print("아라비아 숫자 : " + arabiaNumber);
  }

  public int convert(String romanNumber) {
    int arabiaNumberSum = 0;
    String[] romanNumberList = romanNumber.split("");

    List<Integer> arabiaNumberList = new ArrayList<>();


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
    for(int i = 0; i< arabiaNumberList.size() - 1; i+=1){
      if(arabiaNumberList.get(i) < arabiaNumberList.get(i + 1)){
        arabiaNumberSum -= arabiaNumberList.get(i + 1) * 2;
      }
    }
    return arabiaNumberSum;
  }

}
