import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class PhonebookWriter {

    public static void writeToFile(int format, String path, ArrayList<Contact> phonebook) {
        switch (format) {
            case 1:
                writeToFileFormat1(path, phonebook);
            case 2:
                writeToFileFormat2(path, phonebook);
            default:
                break;
        }
    }

    private static void writeToFileFormat1(String path, ArrayList<Contact> phonebook) {
        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(path), "utf-8"))) {
            for(Contact c : phonebook) {
                writer.write(c.name + "\n");
                writer.write(c.phone + "\n");
                writer.write(c.city + "\n");
                writer.write(c.email + "\n") ;
                writer.write(c.info + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFileFormat2(String path, ArrayList<Contact> phonebook) {
        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(path), "utf-8"))) {
            for(Contact c : phonebook) {
                writer.write(c.name + ";");
                writer.write(c.phone + ";");
                writer.write(c.city + ";");
                writer.write(c.email + ";") ;
                writer.write(c.info + ";\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
