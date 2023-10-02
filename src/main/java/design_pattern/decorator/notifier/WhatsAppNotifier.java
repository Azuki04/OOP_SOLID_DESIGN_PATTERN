package design_pattern.decorator.notifier;

import design_pattern.decorator.NotifierDecorator;

public class WhatsAppNotifier extends NotifierDecorator {

        public WhatsAppNotifier(Notifier notifier) {

            super(notifier);
        }

        @Override
        public void send(String message) {
            super.send(message);
            System.out.println("Sending message from WhatsApp: " + message);
        }
}
