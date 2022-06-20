// 1. static main, non-static run
// 2. Build System 과제의 내용을 재현한다.
// 3. message 메소드의 실행을 테스트하기 위하여 MessageProviderTest 파일을 생성한다.
// 4. 단언문(assertion)을 이용해 message 메소드를 통해 출력되는 값과 원하는 값을 비교해 본다.
// 5. Ashal이라는 특정 이름을 입력하였을 때 출력되는 값과 원하는 값을 비교해본다.
// 6. 궁극적으로 유저의 이름을 '입력받아' "Hello, 유저이름!"의 형태로 문구를 출력한다.


import java.util.Scanner;

public class HelloWorld {
    private Scanner scanner;
    private MessageProvider messageProvider;

    public static void main(String[] args) {
        HelloWorld application = new HelloWorld();
        application.run();
    }

    public void run() {
        String name = getUserName();

        sendNameToMessageProvider(name);

        showMessageToUser();
    }

    public void sendNameToMessageProvider(String name) {
        messageProvider = new MessageProvider(name);
    }

    public String getUserName() {
        scanner = new Scanner(System.in);

        System.out.print("What's your name? ");

        String name = scanner.nextLine();
        return name;
    }

    public void showMessageToUser() {
        System.out.println(messageProvider.message());
    }
}
