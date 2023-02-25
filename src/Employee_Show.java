import java.util.Date;
import java.util.Scanner;

public class Employee_Show {
    public static void view_File(int ID){
        String file_name = String.format("file%s.txt", ID);
        String[] String_Line = new String[7];
        int line_Counter = 0;
        Scanner Input = new Scanner(file_name);
        String line = null;

        while (Input.hasNextLine()){

            line = Input.nextLine();
            String_Line[line_Counter] = line;
            line_Counter++;
        }
    }
    public static void Printer_Data(){
        String Output = String.format(("Employee ID:%s\n" +
                "Employee Name     :%s\n" +
                "Age    :%s\n" +
                "Employee Contact   :%s\n" +
                "Email Information  :%s\n" +
                "Employee position  :%s\n" +
                "Employee Salary    :%s\n"), String_Line[0], String_Line[1]);
    }
}
