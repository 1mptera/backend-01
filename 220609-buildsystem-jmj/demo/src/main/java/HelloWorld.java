// 1. static main, non-static run 메소드 정의
// 2. 빌드시스템 학습 전, "Hello, world!"라는 문구를 출력하는 기본 코드를 작성
// 3. "Hello, world!" 메시지를 다른 클래스에서 받아서 실행하기 위해 MessageProvider라는 클래스를 별도로 만들어주고,
//     그 안에 message라는 메소드를 생성해줌
// 4. 1강 학습 목표 아래와 같이 모두 수행 완료
//    (1) terminal에서 기존의 명령어를 이용하여 컴파일, 실행을 해 보았음
//    (2) ./gradlew 라는 명령어를 이용하여 컴파일&실행을 해 보았음
//    (3) run 아이콘을 눌러 컴파일&실행을 해 보았음

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
