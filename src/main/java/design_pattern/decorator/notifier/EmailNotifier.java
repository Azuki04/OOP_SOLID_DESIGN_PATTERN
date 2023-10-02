package design_pattern.decorator.notifier;

public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        // standard send method
        System.out.println("Sending message from E-Mail: " + message);
    }
}
