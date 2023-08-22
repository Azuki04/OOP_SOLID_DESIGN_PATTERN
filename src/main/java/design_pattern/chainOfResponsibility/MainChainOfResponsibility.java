package design_pattern.chainOfResponsibility;

import java.util.Arrays;

import java.util.List;

public class MainChainOfResponsibility {
    public static void main(String[] args) {


     List<String> user = Arrays.asList("test", "admin");
     List<String> user2 = Arrays.asList("admin", "admin2");
        System.out.println(user.get(0));
        System.out.println();

        Handler handlerCheckSignUp = new HandlerCheckUsername(null);
        Handler handlerCheckLogin = new HandlerCheckUsernameNull(new HandlerCheckPassword(null));

        System.out.println("Sign up");
        handlerCheckSignUp.handleRequest(user);

        System.out.println("Login");
        handlerCheckLogin.handleRequest(user2);








    }
}
