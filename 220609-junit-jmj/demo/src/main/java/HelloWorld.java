// 1. static main, non-static run
// 2. Build System 과제의 내용을 재현한다.
// 3. message 메소드의 실행을 테스트하기 위하여 MessageProviderTest 파일을 생성한다.
// 4. 단언문(assertion)을 이용해 message 메소드를 통해 출력되는 값과 원하는 값을 비교해 본다.


public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld application = new HelloWorld();
        application.run();
    }

    public void run() {
        MessageProvider messageProvider = new MessageProvider();
        System.out.println(messageProvider.message());
    }
}
