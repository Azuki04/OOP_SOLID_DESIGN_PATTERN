package design_pattern.chainOfResponsibility;

import java.util.HashMap;
import java.util.List;

public class Handler {

    protected Handler nextHandler;
    protected UserDB userDB ;

    public Handler (Handler nextHandler) {
        this.nextHandler = nextHandler;
        userDB = UserDB.getUserDB();
    }


    public void handleRequest(List<String> request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }


}
