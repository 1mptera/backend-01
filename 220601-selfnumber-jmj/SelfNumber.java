import java.util.Scanner;

public class SelfNumber {
    public static void main(String[] args) {
        // 0. 준비
        Scanner scanner = new Scanner(System.in);

        // 1. 입력
        System.out.print("정수를 입력해주세요: ");
        int number = scanner.nextInt();

        // 2. 처리
        String result = "셀프넘버입니다.";

        for (int i = 1; i < 10; i += 1) {
            if (number == 2 * i) {
                result = "셀프넘버가 아닙니다.";
                break;
            }
        }

        for (int i = 10; i < 100; i += 1) {
            if (number == i + (i / 10) + (i % 10)) {
                result = "셀프넘버가 아닙니다.";
                break;
            }
        }

        for (int i = 100; i < 1000; i += 1) {
            if (number == i + (i / 100) + ((i - ((i / 100) * 100)) / 10) + (i % 10)) {
                result = "셀프넘버가 아닙니다.";
                break;
            }
        }

        for (int i = 1000; i < 10000; i += 1) {
            if (number == i + (i / 1000)  + ((i - ((i / 1000) * 1000)) / 100) + ((i - ((i / 100) * 100)) / 10) +(i % 10)) {
                result = "셀프넘버가 아닙니다.";
                break;
            }
        }

        // 3. 출력
        System.out.println(result);
    }
}