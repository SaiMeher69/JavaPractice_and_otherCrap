import java.util.*;
import java.io.*;
public class SumFromFile {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("file1.txt");

        Properties p = new Properties();
        p.load(fr);
        System.out.println(p.getProperty("num1"));
        System.out.println(p.getProperty("num2"));
        int c = Integer.parseInt(p.getProperty("num1")) + Integer.parseInt(p.getProperty("num2"));
        System.out.println("sum: " + c);
        fr.close();
       
    }

    


}