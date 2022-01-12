package task_2;

import task_2.account.Account;

public class Runner {

    public static void main(String[] args) {

        String login = "login";
        String password = "password1";
        String confirmPassword = "pasword2";

        if (Account.createdAccount(login, password, confirmPassword)) {
            System.out.println("Account created");
        } else {
            System.out.println("Account not created");
        }

    }

}
