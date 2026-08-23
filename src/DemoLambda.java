interface Message {
    void display();
}

public class DemoLambda {
    public static void main(String[] args) {
        Message msg = () -> System.out.println("Hello World");

        msg.display();
    }
}