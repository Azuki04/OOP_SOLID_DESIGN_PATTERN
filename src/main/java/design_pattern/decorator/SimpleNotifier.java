package design_pattern.decorator;

public class SimpleNotifier implements INotifier {


    @Override
    public void send(String message) {
        System.out.println("Sending message from E-Mail: " + message);
    }
}
