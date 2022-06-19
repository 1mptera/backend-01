//문제 풀이 세부 요구사항
//- 몫, 나머지에 해당되는 변수를 사용하고 변수명을 명확히 한다.
//- reverse method와 같이 문자열을 뒤집는 방식으로 풀지 않는다.
//- 문자열과 charAt method만을 사용해서 푼다.

import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        //입력
        System.out.print("10진수를 입력하세요: ");

        int enteredNumber = scanner.nextInt();

        //처리
        final int DIVISOR = 16;
        final String HEXADECIMAL_NUMBER_INDEX = "0123456789ABCDEF";

        int dividend = enteredNumber;
        String hexadecimalNumber = "";

        if (enteredNumber == 0) {
            hexadecimalNumber += HEXADECIMAL_NUMBER_INDEX.charAt(0);
        }

        while (dividend > 0) {
            int remainder = dividend % DIVISOR;

            char remainderToHexadecimal = HEXADECIMAL_NUMBER_INDEX.charAt(remainder);

            hexadecimalNumber = remainderToHexadecimal + hexadecimalNumber;

            dividend /= DIVISOR;
        }
        //본 풀이과정에서는 각 반복문에서 도출된 remainder에
        //그때까지 도출된 hexadecimalNumber를 뒤에 이어붙여 재할당하는 것을 반복하는 방식으로 최종 16진수를 형성하였음
        //기존의 문자열 '앞쪽에' 새로운 내용을 추가해주는 방식으로 문자열을 이어붙일 수도 있다는 점을 알 수 있었음
        //(도움 출처: https://hianna.tistory.com/603)
        //
        //같은 방식의 또다른 방법으로는 hexadecimalNumber를 String이 아닌 StringBuffer로 정의한 뒤,
        //각 반복문에서 insert(0, remainderToHexadecimal) method를 이용해 문자열에 붙여주는 방법이 있을 수 있음
        //해당 method는 문자열의 원하는 index 위치에 주어지는 값을 추가해주는 기능을 함
        //method에 주어지는 인자들 중 두번째 인자는 hexadecimalNumber에 추가될 값,
        //첫번째 인자는 추가될 값이 들어갈 index 위치를 나타냄

        //출력
        System.out.println("16진수: " + hexadecimalNumber);
    }
}
