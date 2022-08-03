import java.util.*;
import java.util.regex.*;

public class TagContentExtractor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String garb = scan.nextLine();
        Pattern pattern = Pattern.compile("<([^>]+)>([^<>]+)</\\1>");
        Boolean findmatch = true;
        while(n > 0){
            String line = scan.nextLine();
            Matcher m = pattern.matcher(line);
            boolean findMatch = true;
            while(m.find()){
                System.out.println(m.group(2));
                findMatch = false;
            }
            if(findMatch){
                System.out.println("None");
            }
            n--;
        }    
        scan.close();
    }
}
