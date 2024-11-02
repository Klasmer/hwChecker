package service;

import checker.Checker;
import checker.LoopChecker;
import checker.RegexpChecker;
import exeption.WrongLoginException;
import exeption.WrongPasswordException;

import java.util.concurrent.ThreadLocalRandom;

public class ValidationService {
    private static final Checker checker = ThreadLocalRandom.current().nextBoolean() ?
            new LoopChecker() : // 2 способа проверки
            new RegexpChecker(); // выбираются рандомно


    private ValidationService() {

    }

    public static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
checker.checkLogin(login);
checker.checkPassword(password);
checker.checkPasswords(password, confirmPassword);
    }
}
