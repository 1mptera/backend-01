public class HelloWorld {
    public static void main(String[] args){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.run();
    }

    public void run() {
        messageProvider messageprovider = new messageProvider();
        System.out.print(messageprovider.message());
    }
}
