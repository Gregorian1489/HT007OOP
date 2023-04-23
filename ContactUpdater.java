import java.util.Scanner;

public class ContactUpdater {
    public static void update_contact(Phonebook phonebook, Scanner in) {
        System.out.print("Введите имя изменяемой записи \n");
        String name = in.next();
        if (Phonebook.contact_exist(name)){
            System.out.printf("Изменение контакта '%s' \n", name);
            phonebook.delete(name);
            ContactAdder.add_contact(phonebook, in);
        }
        else {
            System.out.printf("Контакт с именем %s не найден.\n ", name);
        }

    }
}




