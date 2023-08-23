package design_pattern.decorator;

public class MainDecorator {

    public static void main(String[] args) {

            System.out.println("only email");
            INotifier simpleNotifier = new SimpleNotifier();
            simpleNotifier.send("Hello");
            System.out.println();
            System.out.println("email and sms");
            INotifier notifier =new WhatsAppNotifier(new SmsNotifier(new SimpleNotifier()));
            notifier.send("Hello");

    }

}
