// - 요구사항
// - 몫, 나머지 변수명 분명히 설정해주기
// - 문자열 뒤집기를 사용하지 않기
// - charAt 과 문자열만 사용해서 풀어주기

// - 문제 풀 때 막혔던 부분
// - String + int 방식이 되는것을 모르고 있었다.
// - 덧셈 연산자를 진행할때 한 쪽이 String형이면 나머지쪽을 String형으로 변환 후 두 문자를 "결합"한다.
// - 예를 들어 "A" + 3 = A3
// - 1 + "A" = 1A 이다.
// - 기존에는 빈 문자열에 += 연산자를 이용해서 순서대로 더해가는 방식을 당연시 생각함. -> 그래서 문자열을 뒤집어야 한다고 생각을 함.

import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        // 준비
        Scanner scanner = new Scanner(System.in);

        String hexadecimal = "";

        String hexadecimalList = "0123456789ABCDEF";

        // 입력
        System.out.print("십진수를 입력해주세요: ");
        int decimalNumber = scanner.nextInt();

        // 처리
        int quotient = decimalNumber;

        while (quotient > 0) {
            for (int i = 0; i < 16; i += 1) {
                if (quotient % 16 == i) {
                    hexadecimal = hexadecimalList.charAt(i) + hexadecimal;
                }
            }
            quotient /= 16;
        }

        // 출력
        System.out.println("16진수 : " + hexadecimal);
    }
}

