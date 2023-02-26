import java.util.*;
import java.io.*;
public class Employee_Management_System {
    int choice;
    Employee_Management_System(int choice){
        this.choice = choice;
    }
    public static void Manage_System() throws InputMismatchException, IOException {
        // Several Inputs need for solving problems with nextLine()
        Scanner Input = new Scanner(System.in);
        Scanner Input1 = new Scanner(System.in);
        Scanner Input2 = new Scanner(System.in);
        int choice = Input.nextInt();
        switch (choice){
            case 1:
                try{
                    System.out.print("Enter Employee's name: ----------: ");
                    Input.nextLine();
                    String Employee_Name = Input1.nextLine();
                    System.out.print("Enter Employee's age: -----------: ");
                    int Employee_Age = Input.nextInt();
                    System.out.print("Enter Employee's Email: ---------: ");
                    Input.nextLine();
                    String Employee_Email = Input2.nextLine();
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
                    Press_Enter();
                }catch (Exception exception){
                    throw new InputMismatchException("Something went wrong, please try again");


                }finally {
                    Press_Enter();
                }
                break;
            case 2:
                System.out.print("Please Enter Employee's ID: ");
                int ID = Input.nextInt();
                Employee_Show.show_File(ID);
                Press_Enter();
                break;
            case 3:
                System.out.print("Please Enter Employee's ID: ");
                ID = Input.nextInt();
                String file_name = String.format("file%s.txt", ID);
                try {
                    Employee_Remove.Delete_File(file_name);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                Press_Enter();
                break;
            case 4:
                System.out.print("Please Enter Employee's ID: ");
                ID = Input.nextInt();
                Input.nextLine();
                System.out.print("Please Enter the detail you want to Update :");
                String key_word = Input1.nextLine();
                System.out.print("Please Enter the Updated Info :");
                String changeable_element = Input2.nextLine();
                Employee_Update.update_File(ID, key_word, changeable_element);
                Press_Enter();
                break;
            case 5:
                CodeExit.Code_exit();
                break;
            default:
                System.out.println("Please chose numbers from list:");
                Main_Menu.MainMenu();
                break;
        }
    }
    // Method which return to Main Menu if you press Enter
    public static void Press_Enter() throws IOException {
        System.out.print("\nPress Enter to Continue...\n");
        while (true){
            char ch = (char) System.in.read();
            if (ch == '\n'){
                Main_Menu.MainMenu();
                break;
            }
        }
    }
}
