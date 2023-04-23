import java.util.Scanner;

public class GetEmailView {
    static String get_email(Scanner in) {
        System.out.print("Введиите email контакта \n");
        String user_email = in.next();
        if (EmailValidator.patternMatches(user_email)) {
            return user_email;
        } else {
            System.out.print("Введенный email не корректен! \n");
            return get_email(in);
        }
    }
}
