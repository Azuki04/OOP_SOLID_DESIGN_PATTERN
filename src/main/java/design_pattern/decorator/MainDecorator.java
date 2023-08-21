package design_pattern.decorator;

public class MainDecorator {
    public static void startDecorator() {
        System.out.println("only email");
        INotifier simpleNotifier = new SimpleNotifier();
        simpleNotifier.send("Hello");
        System.out.println();
        System.out.println("email and sms");
        INotifier notifier = new SmsNotifier(simpleNotifier);
        notifier.send("Hello");
    }
}
