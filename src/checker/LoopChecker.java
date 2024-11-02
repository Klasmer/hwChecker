package checker;

import exeption.WrongLoginException;
import exeption.WrongPasswordException;

public class LoopChecker implements Checker {
    private static final String alphabet = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789_";

    @Override
    public void checkLogin(String login) throws WrongLoginException {
        if (login.isEmpty() || login.length() > 20) {
            throw new WrongLoginException("Длинна логина должна быть меньше или ровна 20");
        }
        for (int i = 0; i < login.length(); i++) {
            if (!alphabet.contains(String.valueOf(login.charAt(i)))) {
                throw new WrongLoginException("Некорректный символ логина : '%c.' ".formatted(login.charAt(i)));
            }
        }
    }

    @Override
    public void checkPassword(String password) throws WrongPasswordException {
        if (password.isEmpty() ||password.length() > 20) {
            throw new WrongPasswordException("Длинна пароля должна быть меньше или ровна 20");
        }
        for (int i = 0; i < password.length(); i++) {
            if (!alphabet.contains(String.valueOf(password.charAt(i)))) {
                throw new WrongPasswordException("Некорректный символ пароля : '%c.' ".formatted(password.charAt(i)));
            }
        }
    }
}
