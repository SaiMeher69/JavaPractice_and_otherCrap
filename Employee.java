import java.util.*;
import java.io.*;


public class Employee{
    public String name;
    public String jobTitle;
    
    public int id;
    public int salary;
    public int age;

    public static void main(String[] args){
        
        SerializeEmployee();
        DeserializeEmployee();
    }

    private static void SerializeEmployee(){

    }
    private static void DeserializeEmployee(){
        try{
            Scanner scan = new Scanner(new File("employee.json"));
            String content = scan.useDelimiter("\\Z").next();
            System.out.println(content);
            scan.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File with that name not found");
        }
    }
    
}