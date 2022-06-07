public class HelloWorld {
  public  messageProvider messageprovider;

  public static void main(String[] args) {
    HelloWorld helloWorld = new HelloWorld();
    helloWorld.run();
  }

  private void run() {
    messageprovider = new messageProvider();
    System.out.println(messageprovider.message());
  }
}
