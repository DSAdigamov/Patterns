package app;

import app.handlers.Handler;

public class AuthService {

    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String email, String password) {
        if (handler.handle(email, password)) {
            System.out.println("Авторизация прошла успешно!");
            return true;
        }
        return false;
    }

}

