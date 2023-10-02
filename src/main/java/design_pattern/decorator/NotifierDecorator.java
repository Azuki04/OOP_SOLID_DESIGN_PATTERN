package design_pattern.decorator;

import design_pattern.decorator.notifier.Notifier;

public class NotifierDecorator implements Notifier {

    private final Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
