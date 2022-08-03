
import java.util.*;

public class Wierdifelse {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        if((myInt%2==1) || ((myInt%2 == 0) && (myInt>=6 && myInt<=20))){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
        scanner.close();
        
    }
}