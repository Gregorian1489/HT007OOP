import java.util.Scanner;

public class ContactCaller {
    public static void call2contact(Phonebook phonebook, Scanner in) {
        System.out.print("Введите имя контакта: \n");
        String name = in.next();
        Contact contact = Phonebook.get_contact(name);
        if (contact != null) {
            System.out.printf("Введите способ вызова: [1 - городской телефон, 2 - мобильный телефон] '%s' \n", name);
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    new CallByCityPhone().call(contact.phone);
                    break;
                case 2:
                    new CallByMobilePhone().call(contact.phone);
                    break;
                default:
                    break;
            }
        }
        else {
            System.out.printf("Контакт с именем %s не найден.\n ", name);
        }

    }
}
