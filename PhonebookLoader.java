import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PhonebookLoader {
    public static ArrayList<Contact> loadFile(int format, String path){
        switch (format) {
            case 1:
                return loadFileFormat1(path);
            case 2:
                return loadFileFormat2(path);
            default:
                return new ArrayList<Contact>();
        }
    }

    private static ArrayList<Contact> loadFileFormat2(String path) {
        ArrayList<Contact> contactsList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String contact;
            while ((contact = br.readLine()) != null){
                String[] substring = contact.split(";");
                contactsList.add(new Contact(substring[0], substring[1], substring[2], substring[3], substring[4]));
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
        return contactsList;
    }

    private static ArrayList<Contact> loadFileFormat1(String path) {
        ArrayList<Contact> contactsList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String name, phone, city, email, info;

            while((name = br.readLine()) != null &&
                    (phone = br.readLine()) != null &&
                    (city = br.readLine()) != null &&
                    (email = br.readLine()) != null &&
                    (info = br.readLine()) != null) {
                contactsList.add(new Contact(name, phone, city, email, info));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contactsList;
    }

}
