import exeption.WrongLoginException;
import exeption.WrongPasswordException;
import service.ValidationService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите логин: ");
            String login = scanner.nextLine();
            System.out.println("Введите пароль: ");
            String password = scanner.nextLine();
            System.out.println("Введите пароль повторно: ");
            String confirmPassword = scanner.nextLine();
            try {
                ValidationService.check(login, password, confirmPassword);
                System.out.println("Вы успешно выполнили вход");
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());

            }
        }
    }
}