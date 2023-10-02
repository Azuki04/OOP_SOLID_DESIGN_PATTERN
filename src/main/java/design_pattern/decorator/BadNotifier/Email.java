package design_pattern.decorator.BadNotifier;

public class Email implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending message from email: " + message);
    }
}
