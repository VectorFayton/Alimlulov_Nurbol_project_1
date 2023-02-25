import java.io.File;

public class Employee_Remove {
    public Employee_Remove(){

    }
    public static void Delete_File(String file_name) throws Exception {
        File file = new File(file_name);
        try{
            if (!file.isDirectory()){
                file.delete();
                System.out.println("Employee has been removed Successfully");
            }
        } catch (Exception e){
            throw new Exception("Employer not exist");
        }
    }
}
