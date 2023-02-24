import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Employee_Add {

    /*public Employee_Add(){
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
            employee_writer.write(String.format("%s %s %s %s %s %s %s", super.Employee_Name, super.Employee_Email, super.Employee_Position, super.Employee_ID, super.Employee_Salary, super.Employee_Position));
            employee_writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/
}
