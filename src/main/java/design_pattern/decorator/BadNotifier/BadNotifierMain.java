package design_pattern.decorator.BadNotifier;

import java.util.ArrayList;
import java.util.List;

public class BadNotifierMain {
    public static void main(String[] args) {
        Notifier notifier = new Sms();
        notifier.send("Hello");

        notifier = new Email();
        notifier.send("Hello");

        List<Notifier> notifiers = new ArrayList<>();
        notifiers.add(new Sms());
        notifiers.add(new Email());

        for (Notifier notifier1 : notifiers) {
            notifier1.send("Hello");

        }
    }
}
