import java.io.*;
import java.util.*;

public class Eof {

    public static void main(String[] args) throws FileNotFoundException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        File file = new File("./random.txt");
        Scanner sc = new Scanner(file);   
        int i = 1;  
        while(sc.hasNext()){
            System.out.println(i + " " + sc.nextLine());
            i++;
        }
        sc.close();
    }
}
