import java.util.*;
import java.util.regex.*;

public class Ipchecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //String regex = scan.nextLine();
        scan.close();
        //Pattern pattern = Pattern.compile("^[\\p{Digit}{3}\\.]{3}\\p{Digit}{3}$");
        //Boolean bool = Pattern.matches("^[\\p{Digit}{3}\\.]{3}\\p{Digit}{3}$", regex);
        Boolean bool = Pattern.matches("^((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])(\\.|$))+", "666.666.23.23");
        if(bool){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
