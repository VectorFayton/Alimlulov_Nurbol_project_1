import java.io.*;
import java.util.Scanner;

public class Employee_Update{
    public Employee_Update(){
    }
    public static void update_File(int ID, String key_word, String changeable_element) {
        // Define the new rows to be written to the file
        String[] newRows = Read_file(ID, key_word, changeable_element);

        // Open the file in read mode
        try {
            BufferedReader reader = new BufferedReader(new FileReader(String.format("file%s.txt", ID)));
            String line = reader.readLine();
            StringBuilder sb = new StringBuilder();

            // Read the file content line by line and modify the lines
            int i = 0;
            while (line != null) {
                // Check if there are new rows to be written to the file
                if (i < newRows.length) {
                    // Use the new row instead of the old row
                    line = newRows[i];
                    i++;
                }

                // Add the line to the StringBuilder
                sb.append(line).append("\n");

                // Read the next line
                line = reader.readLine();
            }

            // Close the file reader
            reader.close();

            // Open the file in write mode
            BufferedWriter writer = new BufferedWriter(new FileWriter(String.format("file%s.txt", ID)));

            // Write the modified lines back to the file
            writer.write(sb.toString());

            // Close the file writer
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Rename the file in case the ID is changed
        String old_name = String.format("file%s.txt", ID);
        String new_name = String.format("file%s.txt", newRows[4]);
        File old_file = new File(old_name);
        old_file.renameTo(new File(new_name));
    }
    public static String[] Read_file(int ID, String key_word, String changeable_element){
        // Read the file line by line
        String[] data_file = Employee_Show.read_File(ID);
        // Analyze Key word, then change element that we want
        switch (key_word){
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
        return data_file;
    }
}
