import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Employee_Add extends EmployeeDetail{

    public Employee_Add(String employee_Name, int employee_Age, String employee_Email, int employee_Position, int employee_ID, float employee_Salary, long employee_Contact){
        super(employee_Name, employee_Age, employee_Email, employee_Position,employee_ID, employee_Salary, employee_Contact);
    }
    public void Create_File(){
        String file_Name = "file" + super.Employee_ID + ".txt";
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
            employee_writer.write(String.format("%s \n%s \n%s \n%s \n%s \n%s \n%s", super.Employee_Name, super.Employee_Age, super.Employee_Email, super.Employee_Position, super.Employee_ID, super.Employee_Salary, super.Employee_Position));
            employee_writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
