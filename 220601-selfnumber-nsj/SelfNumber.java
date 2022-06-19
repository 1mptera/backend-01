import java.util.Scanner;

public class SelfNumber {
    public static void main(String[] args) {
        // 준비
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.print("정수를 입력해주세요: ");
        int integerNumber = scanner.nextInt();

        int[] constructorArray = new int[integerNumber];

        int integerNumberSum = 0;

        // 처리
        for (int i = 0; i < constructorArray.length; i += 1) {
            integerNumberSum = 0;

            int plusNumber = i + 1;
            integerNumberSum += plusNumber;

            while (plusNumber > 0) {
                integerNumberSum += plusNumber % 10;
                plusNumber /= 10;
            }

            constructorArray[i] = integerNumberSum;
        }

        boolean isContainArray = false;

        for (int i = 0; i < constructorArray.length; i += 1) {
            if (constructorArray[i] == integerNumber) {
                isContainArray = true;

                break;
            }
        }

        // 출력
        if (!isContainArray) {
            System.out.println("셀프넘버입니다.");
        }

        if (isContainArray) {
            System.out.println("셀프넘버가 아닙니다.");
        }
    }
}
