
import java.util.*;

public class GarbageLine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        double myDouble = scanner.nextDouble();
        String garbage = scanner.nextLine();
        String myString = scanner.nextLine();
        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
        
        scanner.close();
    }
}
