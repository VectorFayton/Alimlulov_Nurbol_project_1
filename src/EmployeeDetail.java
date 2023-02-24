import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeDetail
{
    String Employee_Name;
    int Employee_Age;
    String Employee_Email;
    int Employee_Position;
    int Employee_ID;
    float Employee_Salary;
    long Employee_Contact;

    public EmployeeDetail(String employee_Name, int employee_Age, String employee_Email, int employee_Position, int employee_ID, float employee_Salary, long employee_Contact) {
        Employee_Name = employee_Name;
        Employee_Age = employee_Age;
        Employee_Email = employee_Email;
        Employee_Position = employee_Position;
        Employee_ID = employee_ID;
        Employee_Salary = employee_Salary;
        Employee_Contact = employee_Contact;
    }

}