//



public class HelloWorld {
    public static void main(String[] args){
        HelloWorld helloworld = new HelloWorld();
        helloworld.run();
    }

    private void run() {
        MessageProvider messageProvider = new MessageProvider("Inu");
        messageProvider.message();

        System.out.println(messageProvider.message());
    }
}
