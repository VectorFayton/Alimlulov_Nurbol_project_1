import java.util.*;

public class Main_Menu {
    public static void main(String[] args){
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
        int choice = Input.nextInt();
        switch (choice){
            case 1:
                System.out.print("Enter Employee's name: ----------: ");
                Input.next();
                String Employee_Name = Input.nextLine();
                System.out.print("Enter Employee's age: -----------: ");
                int Employee_Age = Input.nextInt();
                System.out.print("Enter Employee's Email: ---------: ");
                Input.next();
                String Employee_Email = Input.nextLine();
                System.out.print("Enter Employee's Position: ------:");
                int Employee_Position = Input.nextInt();
                System.out.print("Enter Employee's ID: ------------:");
                int Employee_ID = Input.nextInt();
                System.out.print("Enter Employee's salary: --------:");
                float Employee_Salary = Input.nextFloat();
                System.out.print("Enter Employee's contact Info: --:");
                long Employee_Contact = Input.nextLong();
                Employee_Add Employee = new Employee_Add(Employee_Name, Employee_Age, Employee_Email, Employee_Position, Employee_ID, Employee_Salary, Employee_Contact);
                Employee.Create_File();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                CodeExit.Code_exit();
                break;
        }
    }
}
