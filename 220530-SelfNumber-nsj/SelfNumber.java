// 셀프넘버
// 셀프넘버인지 아닌지 판별할 정수를 입력받는다
// 셀프넘버는 생성자가 없는 수를 의미한다.
// 생성자는 입력받은 n을 각 자리수를 더한 결과를 의미한다.
// 75 = 75 + 7 + 5 = 87, 75는 87의 생성자 이다.
// 각 자리수의 합으로 나타낼 수 없는 수 -> 셀프넘버

import java.util.Arrays;
import java.util.Scanner;

public class SelfNumber {
    public static void main(String[] args) {
        // 준비
        Scanner scanner = new Scanner(System.in);

        int[] selfNumber = new int[10000];

        int selfNumberResult = 0;

        // 입력
        System.out.print("정수를 입력해주세요: ");
        int number = scanner.nextInt();

        // 처리
        for (int i = 1; i < selfNumber.length; i += 1) {
            if (i < 10) {
                selfNumberResult = i + i;
            }
            if (i >= 10 && i < 100) {
                selfNumberResult = i + i / 10 + i % 10;
            }
            if (i >= 100 && i < 1000) {
                selfNumberResult = i + i / 100 + (i % 100) / 10 + (i % 100) % 10;
            }
            if (i >= 1000 && i < 10000) {
                selfNumberResult = i + i / 1000 + (i % 1000) / 100 + (i % 1000) % 100 / 10 + (i % 1000) % 100 % 10;
            }
            selfNumber[i - 1] = selfNumberResult;
        }

        // 출력

        if (Arrays.asList(selfNumber).contains(number)) {
            System.out.println("셀프넘버가 아닙니다.");
        }

        if (!Arrays.asList(selfNumber).contains(number)) {
            System.out.println("셀프넘버입니다.");
        }
    }
}
