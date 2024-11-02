package checker;

import exeption.WrongLoginException;
import exeption.WrongPasswordException;

public interface Checker {
    void checkLogin(String login) throws WrongLoginException;

    void checkPassword(String password) throws WrongPasswordException;

    default void checkPasswords(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}
