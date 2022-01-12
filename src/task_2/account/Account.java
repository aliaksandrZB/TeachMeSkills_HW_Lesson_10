package task_2.account;

import task_2.my_exception.WrongLoginException;
import task_2.my_exception.WrongPasswordException;

public class Account {

    public static boolean createdAccount (String login, String password, String confirmPassword) {

        boolean flag = false;
        if (login.length() >= 20 || login.contains(" ")) {
            try {
                throw new WrongLoginException("Login does not meet the standards");
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            }
        }

        if (password.length() >= 20 || password.contains(" ") || !isPasswordContainNumber(password)) {
            try {
                throw new WrongPasswordException("Password does not meet the standards");
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
                return false;
            }
        }

        if (!password.equals(confirmPassword)) {
            try {
                throw new WrongPasswordException("Password mismatch");
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
                return false;
            }
        }

        return true;

    }

    public static boolean isPasswordContainNumber (String password) {
        boolean flag = false;
        for (int i = 0; i < password.length(); ++i) {
            if (password.charAt(i) >= 47 && password.charAt(i) <= 59) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}
