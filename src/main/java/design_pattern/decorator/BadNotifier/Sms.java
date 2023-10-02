package design_pattern.decorator.BadNotifier;

public class Sms implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending message from SMS: " + message);
    }
}
