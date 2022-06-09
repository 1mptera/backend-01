//main -> run
// 입력 처리 출력
// 입력    식(expression) ex 1 + 1
//


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Calculator application = new Calculator();
        application.run();
    }

    public void run() {
        //준비
        Scanner scanner = new Scanner(System.in);
        //입력
        System.out.print("식을 입력해 주세요: ");
        String expression = scanner.nextLine();

        //처리
        int result = compute(expression);

        //출력
        System.out.print(result);

    }

    public int compute(String expression) {
        String[] words = expression.split(" ");

        int x = Integer.parseInt(words[0]);
        int y = Integer.parseInt(words[2]);
        return x;
    }
}
