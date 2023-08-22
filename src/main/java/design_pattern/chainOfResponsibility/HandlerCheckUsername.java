package design_pattern.chainOfResponsibility;

import java.util.HashMap;
import java.util.List;

public class HandlerCheckUsername extends Handler{

    public HandlerCheckUsername(Handler nextHandler) {
        super(nextHandler);

    }

    @Override
    public void handleRequest(List<String> request) {
        if (UserDB.getUserDB().checkUsernameExists(request.get(0))) {
            System.out.println("Username is taken, please pick another");
        } else {
            System.out.println("Username is valid");
            UserDB.getUserDB().addUser(request.get(0), request.get(1));
            System.out.println("User added to database");
            super.handleRequest(request);
        }

    }
}
