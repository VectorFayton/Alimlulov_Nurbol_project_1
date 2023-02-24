import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Employee name: ");
        String Employee_Name = Input.nextLine();
        System.out.println("Employee age: ");
        int Employee_Age = Input.nextInt();
        System.out.println("Employee email: ");
        String Employee_Email = Input.nextLine();
        System.out.println("Employee position: ");
        int Employee_Position = Input.nextInt();
        System.out.println("Employee ID: ");
        int Employee_ID = Input.nextInt();
        System.out.println("Employee salary: ");
        float Employee_Salary = Input.nextFloat();
        System.out.println("Employee contact: ");
        long Employee_Contact = Input.nextLong();
        Employee Coder = new Employee(Employee_Name, Employee_Age, Employee_Email, Employee_Position, Employee_ID, Employee_Salary, Employee_Contact);
        Coder.Employee_Add();
    }
}