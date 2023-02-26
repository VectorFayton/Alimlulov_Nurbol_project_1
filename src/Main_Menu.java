import java.io.IOException;
import java.util.*;

public class Main_Menu {
    public Main_Menu(){

    }
    public static void MainMenu() throws IOException {
        Scanner Input = new Scanner(System.in);
        System.out.println("************************************************* \n" +
                "Organization Management System \n" +
                "************************************************* \n");
        System.out.println("Press 1 : Add an Employee Details");
        System.out.println("Press 2 : See an Employee Details");
        System.out.println("Press 3 : Remove an Employee");
        System.out.println("Press 4 : Update Employee Details");
        System.out.println("Press 5 : Exit the EMS Portal");
        System.out.print("Please Enter choice : ");
        Employee_Management_System.Manage_System();
    }
}
