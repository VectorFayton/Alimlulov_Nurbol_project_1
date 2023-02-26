import java.io.*;
import java.util.Scanner;

public class Employee_Update {
    public Employee_Update() {
    }

    public static void update_File(int ID, String key_word, String changeable_element) {
        String[] data_file = Employee_Show.read_File(ID);
        System.out.println(data_file);
        switch (key_word) {
            case "Name":
                data_file[0] = changeable_element;
                break;
            case "Age":
                data_file[1] = changeable_element;
                break;
            case "Email":
                data_file[2] = changeable_element;
                break;
            case "Position":
                data_file[3] = changeable_element;
                break;
            case "ID":
                data_file[4] = changeable_element;
                break;
            case "Salary":
                data_file[5] = changeable_element;
                break;
            case "Contact":
                data_file[6] = changeable_element;
                break;
        }
        System.out.println(data_file);
        try {
            String file_name = String.format("file%s.txt", ID);
            Employee_Remove.Delete_File(file_name);
            String changed_file_name = String.format("file%s.txt", data_file[4]);
            FileWriter file = new FileWriter(changed_file_name);
            file.write(String.format("%s \n%s \n%s \n%s \n%s \n%s \n%s", data_file[0], data_file[1], data_file[2], data_file[3], data_file[4], data_file[5], data_file[6]));
            file.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
