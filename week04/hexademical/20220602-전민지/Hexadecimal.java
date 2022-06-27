// 1. 준비-입력-처리-출력 단계 설정하여 기본값 세팅
// 2. 제한조건
//    -> 몫, 나머지 변수명 분명히 설정해주기
//    -> 문자열 뒤집기를 사용하지 않기
//    -> charAt과 문자열만 사용해서 풀어주기
// 3. 배열이 아닌 문자열을 사용해야 하므로 hexadecimalTable에 16진수 시스템 문자열 설정하기
// 4. 몫, 나머지 변수 설정 및 16진수이므로 base 변수도 선언하여 16으로 assign
// 5. 초기 결과값은 최종 결과값의 reversed 상태이므로 출력 시 뒤집어줄 것
// 6. 코딩테스트 회고
//    -> 어차피 문자열을 뒤집어서 출력하는 메소드는 사전 지식이 없었기 때문에 charAt()를 정확히 숙지한 후 풀었어야 했음
//    -> 시간 내에 풀어보았다는 점은 아주 고무적임
//    -> 다만 중간에 있는 quotient 변수 선언 시 for문에 진입하기 위해 초기값을 1로 할당한 것은 찜찜한 부분. 더 좋은 방법은 없을까?
//    -> decimalNumber를 계속 재할당하여 쓸 순 있지만 제한조건에 quotient 선언이 있기 때문에 사용은 했어야 할 일이지만 좋은 코드로 보이진 않음
//    -> 어제 동료들이랑 짝프로 풀어본 것이 큰 도움이 되었음. 특히 나는 결과값을 모두 완벽하게 도출한 다음에 출력을 해야한다고 생각했는데
//       동료들의 풀이방법을 보니 reversed된 결과값을 한글자씩 반대로 출력하는 것도 좋은 방법이라는 것을 캐치해서 이번에도 사용함

import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        // 0. 준비
        Scanner scanner = new Scanner(System.in);

        // 1. 입력
        System.out.print("십진수를 입력해주세요 : ");
        int decimalNumber = scanner.nextInt();

        // 2. 처리
        String hexadecimalTable = "0123456789ABCDEF";
        String reversedHexadecimalNumber = "";

        int quotient = 1;
        int remainder = 0;
        int base = 16;

        for (int i = 0; quotient > 0; i += 1) {
            quotient = decimalNumber / base;
            remainder = decimalNumber % base;
            reversedHexadecimalNumber += hexadecimalTable.charAt(remainder);

            decimalNumber = quotient;
        }

        // 3. 출력
        System.out.print("16진수: " );
        for (int i = reversedHexadecimalNumber.length(); i > 0; i -= 1) {
            System.out.print(reversedHexadecimalNumber.charAt(i-1));
        }
        System.out.println();
    }
}
