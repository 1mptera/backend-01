import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        // 0. 준비
        Scanner scanner = new Scanner(System.in);

        // 1. 입력
        System.out.print("배열의 한변 길이 : ");
        int side = scanner.nextInt();

        // 2. 찐 처리
        // 2-1. numberTable의 인덱스 별 정수값 할당
        int[] numberTable = new int[side * side];

        for (int i = 0; i < (numberTable.length); i += 1) {
            numberTable[i] = i;
        }

        // 숫자 10개만 나열해보기
        for (int i = 0; i < 10; i += 1) {
            if (i < 5) {
                System.out.print(numberTable[i]);
                System.out.print("\t");
            }
            if (i >= 5) {
                System.out.println();
                System.out.print(numberTable[i]);
            }
        }

//
//        // 2-2. 첫번째 줄
//        for (int i = 0; i < side; i += 1) {
//            System.out.print(numberTable[i]);
//            System.out.print("\t");
//        }
//        System.out.println();
//
//        // 2-3. 두번째 줄
//        for (int i = 0; i < side - 1; i += 1) {
//            System.out.print(numberTable[(side * 4 - 5) + i]);
//            System.out.print("\t");
//        }
//        System.out.println();

        // 3. 출력
//        System.out.println(result);
    }
}
