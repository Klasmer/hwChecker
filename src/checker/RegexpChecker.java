package checker;

import exeption.WrongLoginException;
import exeption.WrongPasswordException;

public class RegexpChecker implements Checker {
    private static final String regexp = "^\\w{1,20}$";

    @Override
    public void checkLogin(String login) throws WrongLoginException {
        if (!login.matches(regexp)) {
            throw new WrongLoginException("Длинна или сиволы логина некорректны");
        }
    }

    @Override
    public void checkPassword(String password) throws WrongPasswordException {
        if (!password.matches(regexp)) {
            throw new WrongPasswordException("Длинна или сиволы пароля некорректны");
        }


    }
}
