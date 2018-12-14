package sample.repo;

import java.util.HashMap;
import java.util.Map;

public class LoginRepo {
    private Map<String, String> logins = new HashMap<String, String>() {{
        put("admin", "admin");
        put("tester", "fortest");
    }};

    public Boolean login(String login, String password) {
        return logins.containsKey(login) && logins.get(login).equalsIgnoreCase(password);
    }
}
