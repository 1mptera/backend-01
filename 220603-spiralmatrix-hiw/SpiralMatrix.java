import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        //입력
        System.out.print("배열의 한 변 길이: ");

        int length = scanner.nextInt();

        //Guard Clause
        if (length <= 0) {
            System.out.println("잘못된 길이 입력입니다.");

            return;
        }

        //처리
        int[][] spiralArray = new int[length][length];
        int starts = 0;
        int ends = length - 1;

        int puttingNumber = 0;

        while (starts <= ends) {
            //Left to Right
            for (int i = starts; i <= ends; i += 1) {
                spiralArray[starts][i] = puttingNumber;
                puttingNumber += 1;
            }

            //Up to Down
            if (starts + 1 <= ends) {
                for (int i = starts + 1; i <= ends; i += 1) {
                    spiralArray[i][ends] = puttingNumber;
                    puttingNumber += 1;
                }
            }

            //Right to Left
            if (ends - 1 >= starts) {
                for (int i = ends - 1; i >= starts; i -= 1) {
                    spiralArray[ends][i] = puttingNumber;
                    puttingNumber += 1;
                }
            }

            //Down to Up
            if (ends - 1 >= starts + 1) {
                for (int i = ends - 1; i >= starts + 1; i -= 1) {
                    spiralArray[i][starts] = puttingNumber;
                    puttingNumber += 1;
                }
            }

            starts += 1;
            ends -= 1;
        }

        //출력
        for (int i = 0; i < spiralArray.length; i += 1) {
            for (int j = 0; j < spiralArray.length; j += 1) {
                System.out.print(spiralArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
