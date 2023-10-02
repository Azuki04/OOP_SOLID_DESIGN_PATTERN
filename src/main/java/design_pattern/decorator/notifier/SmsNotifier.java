package design_pattern.decorator.notifier;

import design_pattern.decorator.NotifierDecorator;

public class SmsNotifier extends NotifierDecorator {

    public SmsNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending message from SMS: " + message);
    }
}
