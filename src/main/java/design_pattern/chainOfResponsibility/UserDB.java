package design_pattern.chainOfResponsibility;

import java.util.HashMap;

public class UserDB {

    HashMap<String, String> users = new HashMap<>();

    public static UserDB getUserDB() {
        return new UserDB();
    }
    public UserDB() {
        userDB();
    }
    public void userDB() {
        users.put("admin", "admin");
        users.put("user", "password123");
        users.put("user2", "test");
    }

    public boolean checkUsernameExists(String username) {
        return users.containsKey(username);
    }


    public HashMap<String, String> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, String> users) {
        this.users = users;
    }

    public void addUser(String username, String password) {
        users.put(username, password);
    }

    public boolean checkPassword(String s, String s1) {
        return users.get(s).equals(s1);
    }
}
