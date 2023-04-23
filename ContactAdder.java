import java.util.Scanner;

public class ContactAdder {
    public static void add_contact(Phonebook phonebook, Scanner in) {
        String name, phone, email, city, info;
        System.out.print("Введиите имя контакта \n");
        name = in.next();
        System.out.print("Введиите телефон контакта \n");
        phone = in.next();
        email = GetEmailView.get_email(in);
        System.out.print("Введиите город контакта \n");
        city = in.next();
        System.out.print("Введиите информацию о контакте \n");
        info = in.next();
        phonebook.add(new Contact(name, phone, city, email, info));
    }
}

