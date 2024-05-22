package app.handlers;

public class RoleCheckHandler extends Handler {

    @Override
    public boolean handle(String username, String password) {
        if ("admin_username".equals(username)) {
            System.out.println("Загрузка страница админа...");
            return true;
        }
        System.out.println("Загрузка обычный панели...");
        return handleNext(username, password);
    }

}

