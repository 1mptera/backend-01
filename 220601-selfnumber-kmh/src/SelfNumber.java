import java.util.Scanner;

//셀프넘버는 항상 자기 자신보다 작은 것만 확인하면 됨을 확인
// 주어진 수가 셀프넘버인지 확인하려면 자신보다 낮은 모든 정수를 각각 본인과 각각 자릿수를 더 했을때 자기 자신이 없으면된다. 5가 셀프넘버 1 = 1+ 1=>2 2 = 2 +2+>4 3.+>6. 4 = 4+4+>8
// for i=1 ; i<input; i +=1
// String.length = 그 숫자 자릿수  예) 1234 => length 4   =>char.At(0) char.At(1) char.At(2)
// if 구한값 = 주어진수와 같다 break; => self number 아님
//
public class SelfNumber {
  public static void main(String[] args) {
    //준비,도입
    Scanner scanner = new Scanner(System.in);
    System.out.print("정수를 입력해 주세요: ");
    int input = scanner.nextInt();

    boolean isSelfNumber = true;
    String resultMessage = "셀프넘버 입니다.";

    for (int i = 1; i < input; i += 1) {
      int result = i;

      String numbers = Integer.toString(result);
//      System.out.println(numbers.toCharArray());
      System.out.println(numbers.split("")[0]);

      for (int j = 0; j < Integer.toString(i).length(); j += 1) {
        char digitNumber = Integer.toString(i).charAt(j);
        result += Character.getNumericValue(digitNumber);
      }

      if (result == input) {
        isSelfNumber = false;
      }
    }

    if (!isSelfNumber) {
      resultMessage = "셀프넘버가 아닙니다.";
    }

    System.out.println(resultMessage);
  }
}

//        String result = "";
//        String inputToString = Integer.toString(input);
//
//        for (int i = 1; i < input; i += 1) {
//            for (int j = 0; j < inputToString.length(); j += 1) {
//                inputToString = Integer.toString(i);
//                System.out.println("InputToString " + inputToString);
//                System.out.println("char.At" + inputToString.charAt(j));
//
//            }
//            result += inputToString.charAt(j);
//            System.out.println(result);\
//        }
