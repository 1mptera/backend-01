// 1. static main, non-static run 메소드 각각 정의
// 2. run 메소드에 "Hello, world!" 문구 출력하기 위해 System.out.println 활용
// 3. 문구를 받아서 출력하기 위해 MessageProvider라는 별도의 Class를 만든다.
// 4. 문구를 받아줄 메소드(message) creation
// 5. MessageProvider의 기능이 잘 작동하는지를 확인하기 위하여 MessageProviderTest 파일 생성

import java.util.Scanner;

public class HelloWorld {

    private MessageProvider messageProvider;

    public static void main(String[] args) {
        HelloWorld application = new HelloWorld();
        application.run();
    }

    public void run() {


        System.out.print("What's your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        messageProvider = new MessageProvider(name);

        System.out.println(messageProvider.message());
    }
}
