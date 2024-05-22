package app.handlers;

import app.Database;
public class UserExistsHandler extends Handler {

    private final Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            System.out.println("Пользователь " + username + " существует!");
            return false;
        }
        return handleNext(username, password);
    }

}

