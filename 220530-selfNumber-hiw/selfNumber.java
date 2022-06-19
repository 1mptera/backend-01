//요구사항: 주어진 숫자가 셀프 넘버인지 확인한다.
//셀프 넘버란? 어떠한 숫자의 숫자 그 자신과, 숫자 그 자신의 각 자리수를 모두 더하면 결과가 도출된다.
//이때 원래의 어떠한 숫자 그 자신과 각 자리수에 해당하는 숫자는 도출된 결과 숫자의 생성자라고 하는데, 셀프 넘버는 이런 생성자가 없는 숫자를 의미한다.
//ex. 주어지는 숫자에 따른 도출되는 숫자
//1: 1 + 1 >> 2
//2: 2 + 2 >> 4
//3: 3 + 3 >> 6
//4: 4 + 4 >> 8
//5: 5 + 5 >> 10
//...
//8: 8 + 8 >> 16
//9: 9 + 9 >> 18 (2, 4, (+2), ... , 16, 18)
//10: 10 + 1 + 0 >> 11
//11: 11 + 1 + 1 >> 13
//12: 12 + 1 + 2 >> 15
//13: 13 + 1 + 3 >> 17
//...
//18: 18 + 1 + 8 >> 27
//19: 19 + 1 + 9 >> 29 (11, 13, (+2), ... , 27, 29)
//20: 20 + 2 + 0 >> 22
//21: 21 + 2 + 1 >> 24
//22: 22 + 2 + 2 >> 26
//23: 23 + 2 + 3 >> 28
//...
//28: 28 + 2 + 8 >> 38
//29: 29 + 2 + 9 >> 40 (22, 24, (+2), ... , 38, 40)
//30: 30 + 3 + 0 >> 33 (33, 35, (+2), ... , 49, 51)
//31: 31 + 3 + 1 >> 35
//32: 32 + 3 + 2 >> 37
//33: 33 + 3 + 3 >> 39
//...
//97: 97 + 9 + 7 >> 113
//98: 98 + 9 + 8 >> 115
//99: 99 + 9 + 9 >> 117
//100: 100 + 1 + 0 + 0 >> 101
//101: 101 + 1 + 0 + 1 >> 103
//
//어떤 숫자가 주어지면, i를 0부터 (그 숫자 크기 - 1)까지 1씩 증가시켜나가는 반복문을 수행하는데,
//각 반복문에서는 i와 i의 각 자리수 숫자들을 모두 더한 뒤 원래의 어떤 숫자와 같은지 비교한다.
//반복문이 종료될 때까지 한 번도 같지 않은 것으로 판별되면 원래의 어떤 숫자는 셀프 넘버이다.
//위의 구상을 해내기까지 45분이 소요되었음

import java.util.Scanner;

public class selfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력해주세요: ");

        int userInput = scanner.nextInt();

        boolean isSelfNumber = true;

        for (int i = 0; i < userInput; i += 1) {
            int numberAddedAllDigits = i;
            String iToString = Integer.toString(i);

            for (int j = 0; j < iToString.length(); j += 1) {
                numberAddedAllDigits += Character.getNumericValue(iToString.charAt(j));
            }

            if (userInput == numberAddedAllDigits) {
                isSelfNumber = false;
            }
        }

        if (isSelfNumber) {
            System.out.println("셀프넘버입니다.");
        }
        if (!isSelfNumber) {
            System.out.println("셀프넘버가 아닙니다.");
        }
    }
}
