package design_pattern.decorator;

public class WhatsAppNotifier extends NotifierDecorator{

        public WhatsAppNotifier(INotifier notifier) {
            super(notifier);
        }

        @Override
        public void send(String message) {
            super.send(message);
            System.out.println("Sending message from WhatsApp: " + message);
        }
}
