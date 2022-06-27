public class messageProvider {
  private final String name;

  public messageProvider(String name) {
    this.name = name;
  }

  public messageProvider() {
    this.name = "world";
  }

  public static void main(String[] args) {
    messageProvider messageprovider = new messageProvider();
    System.out.println(messageprovider.message());
  }

  public String message() {
    return "Hello, "+ name + "!";
  }
}
