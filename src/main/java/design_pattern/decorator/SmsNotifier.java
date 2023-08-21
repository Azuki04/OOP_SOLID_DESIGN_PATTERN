package design_pattern.decorator;

public class SmsNotifier extends NotifierDecorator{

    public SmsNotifier(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending message from SMS: " + message);
    }
}
