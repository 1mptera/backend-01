// 1. Hello, World! 라는 문구를 기존과 같이 출력한다.
// 2. run -> new java file

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld application = new HelloWorld();
        application.run();
    }

    public void run() {
        MessageProvider messageProvider = new MessageProvider();
        messageProvider.message();

        System.out.println(messageProvider.message());
    }
}
