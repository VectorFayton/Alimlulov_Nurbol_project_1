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
        System.out.println("Please Enter choice");
        int choice = Input.nextInt();
        switch (choice){
            case 1:
                System.out.print("Employee name: ");
                String Employee_Name = Input.nextLine();
                System.out.print("Employee age: ");
                int Employee_Age = Input.nextInt();
                System.out.print("Employee email: ");
                Input.next();
                String Employee_Email = Input.nextLine();
                System.out.print("Employee position: ");
                int Employee_Position = Input.nextInt();
                System.out.print("Employee ID: ");
                int Employee_ID = Input.nextInt();
                System.out.print("Employee salary: ");
                float Employee_Salary = Input.nextFloat();
                System.out.print("Employee contact: ");
                long Employee_Contact = Input.nextLong();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }
}
