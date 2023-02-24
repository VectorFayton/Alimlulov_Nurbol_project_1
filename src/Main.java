import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
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
        EmployeeDetail Coder = new EmployeeDetail(Employee_Name, Employee_Age, Employee_Email, Employee_Position, Employee_ID, Employee_Salary, Employee_Contact);
    }
}