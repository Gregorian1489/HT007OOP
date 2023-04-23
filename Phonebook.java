import java.util.ArrayList;

public class Phonebook {
    static ArrayList<Contact> phonebook = new ArrayList<Contact>();

    public Phonebook() {
        phonebook = new ArrayList<Contact>();
    }

    public static void loadFile(int i, String file) {
        phonebook = PhonebookLoader.loadFile(i, file);
    }

    public void add(Contact contact){
        phonebook.add(contact);
    }

    public void show() {
        phonebook.forEach(Contact::show);
    }


    void writeToFile(int format, String path) {
        PhonebookWriter.writeToFile(format, path, phonebook);
    }

    static boolean contact_exist(String name) {
        for (Contact c: phonebook) {
            if (c.name.equals(name)) {
                return true;
            }
        }
        return false;
    }

    static Contact get_contact(String name) {
        for (Contact c: phonebook) {
            if (c.name.equals(name)) {
                return c;
            }
        }
        return null;
    }
    public void delete(String name) {
        phonebook.removeIf(c -> c.name.equals(name));
    }
}


