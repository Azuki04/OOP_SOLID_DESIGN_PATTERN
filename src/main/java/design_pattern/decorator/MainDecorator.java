package design_pattern.decorator;

import design_pattern.decorator.notifier.Notifier;
import design_pattern.decorator.notifier.EmailNotifier;
import design_pattern.decorator.notifier.SmsNotifier;
import design_pattern.decorator.notifier.WhatsAppNotifier;

public class MainDecorator {

    public static void main(String[] args) {
            System.out.println();
            System.out.println("only email");
            Notifier simpleNotifier = new EmailNotifier();
            simpleNotifier.send("Hello");

            System.out.println();
            simpleNotifier = new SmsNotifier(simpleNotifier);
            simpleNotifier.send("Hello");

            System.out.println();
            System.out.println("email and sms");
            Notifier notifier = new WhatsAppNotifier(new SmsNotifier(new EmailNotifier()));
            notifier.send("Hello");

    }

}
