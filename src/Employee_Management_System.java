import java.util.*;
public class Employee_Management_System {
    int choice;
    Employee_Management_System(int choice){
        this.choice = choice;
    }
    public static void Manage_System(){
        Scanner Input = new Scanner(System.in);
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
                System.out.print("Enter Employee's Position: ------: ");
                int Employee_Position = Input.nextInt();
                System.out.print("Enter Employee's ID: ------------: ");
                int Employee_ID = Input.nextInt();
                System.out.print("Enter Employee's salary: --------: ");
                float Employee_Salary = Input.nextFloat();
                System.out.print("Enter Employee's contact Info: --: ");
                long Employee_Contact = Input.nextLong();
                Employee_Add Employee = new Employee_Add(Employee_Name, Employee_Age, Employee_Email, Employee_Position, Employee_ID, Employee_Salary, Employee_Contact);
                Employee.Create_File();
                System.out.print("\nPress Enter to Continue\n");
                Input.nextLine();
                Main_Menu.MainMenu();
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
