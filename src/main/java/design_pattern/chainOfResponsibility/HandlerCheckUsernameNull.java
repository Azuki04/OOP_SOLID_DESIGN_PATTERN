package design_pattern.chainOfResponsibility;

import java.util.List;

public class HandlerCheckUsernameNull extends Handler{
    public HandlerCheckUsernameNull(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(List<String> request) {
        if (UserDB.getUserDB().checkUsernameExists(request.get(0))) {
            System.out.println("Username is valid");
            super.handleRequest(request);
        } else {
            System.out.println("Username is invalid");
            System.out.println("error 400");

        }
    }
}
