import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Employee
{
    private String Employee_Name;
    private int Employee_Age;
    private String Employee_Email;
    private int Employee_Position;
    private int Employee_ID;
    private float Employee_Salary;
    private long Employee_Contact;

    public Employee(String employee_Name, int employee_Age, String employee_Email, int employee_Position, int employee_ID, float employee_Salary, long employee_Contact) {
        Employee_Name = employee_Name;
        Employee_Age = employee_Age;
        Employee_Email = employee_Email;
        Employee_Position = employee_Position;
        Employee_ID = employee_ID;
        Employee_Salary = employee_Salary;
        Employee_Contact = employee_Contact;
    }
    public void Employee_Add(){
        String file_Name = "file" + Employee_ID + ".txt";
        try{
            File file = new File(file_Name);
            if(file.createNewFile()){
                WriterFile(file_Name);
                System.out.println(String.format("Employee %s created successfully.", file_Name));
            } else{
                System.out.println("Employee already exists.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void WriterFile(String file_name){
        try{
            FileWriter employee_writer = new FileWriter(file_name);
            employee_writer.write(String.format("%s %s %s %s %s %s %s", Employee_Name, Employee_Age, Employee_Email, Employee_Position, Employee_ID, Employee_Salary, Employee_Position));
            employee_writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}