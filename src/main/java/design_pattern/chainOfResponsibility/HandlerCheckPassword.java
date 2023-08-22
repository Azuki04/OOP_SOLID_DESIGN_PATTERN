package design_pattern.chainOfResponsibility;

import java.util.HashMap;
import java.util.List;

public class HandlerCheckPassword extends Handler{

    public HandlerCheckPassword(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(List<String> request) {
        if (UserDB.getUserDB().checkPassword(request.get(0), request.get(1))) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
            System.out.println("error 400");
        }
        super.handleRequest(request);
    }
}
