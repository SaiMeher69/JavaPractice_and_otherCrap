import java.util.*;
import java.util.regex.*;

public class RegexSyntaxChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] regexes = new String[n];
        String garb = sc.nextLine();
        for(int i = 0; i < n; i++){
            regexes[i] = sc.nextLine(); 
        }
        sc.close();
        for(int i = 0; i < n; i++){
            try{
                Pattern pattern = Pattern.compile(regexes[i]);
                System.out.println("valid");
            }catch(PatternSyntaxException e){System.out.println("invalid");}
        }
    }
}
