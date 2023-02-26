import java.util.Date;
import java.util.Scanner;
import java.io.*;

public class Employee_Show {
    public static String[] read_File(int ID) {
        String file_name = String.format("file%s.txt", ID);
        File file = new File(file_name);
        int line_Counter = 0;
        Scanner Input = null;
        try {
            Input = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line;
        String[] String_Line = new String[7];

        while (Input.hasNextLine()) {

            line = Input.nextLine();
            String_Line[line_Counter] = line;
            line_Counter++;
        }
        return String_Line;
    }
    public static void show_File(int ID){
        String[] read_String_Line = read_File(ID);
        String Output = String.format("" +
                " Employee ID        : %s\n " +
                "Employee Name      : %s\n " +
                "Age                : %s\n " +
                "Employee Contact   : %s\n " +
                "Email Information  : %s\n " +
                "Employee position  : %s\n " +
                "Employee Salary    : %s$\n ", read_String_Line[4], read_String_Line[0], read_String_Line[1], read_String_Line[6], read_String_Line[2], read_String_Line[3], read_String_Line[5]);
        System.out.println(Output);
    }

}
