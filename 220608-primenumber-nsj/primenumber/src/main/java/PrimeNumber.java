import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        PrimeNumber application = new PrimeNumber();
        application.run();
    }

    private void run() {
        // 준비
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.print("n :");
        int naturalNumber = scanner.nextInt();

        // 처리
        String primeNumber = process(naturalNumber);

        // 출력
        System.out.println(primeNumber);
    }

    public String process(int naturalNumber) {

        for (int i = 2; i < naturalNumber; i += 1) {
            if(naturalNumber % i == 0) {
                return "소수 아님";
            }
        }

        return "소수";
    }
}
