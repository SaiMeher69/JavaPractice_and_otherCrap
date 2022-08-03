//import java.io.*;
import java.util.*;

public class Maxsubstring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = sc.nextInt();
        sc.close();
        String maxString = s.substring(0,l), minString = s.substring(0,l);
        for(int i = 0; i < s.length()-(l-1); i++){
            if(maxString.compareTo(s.substring(i, i+l)) <= 0){
                maxString = s.substring(i,i+l);
            }
            if(minString.compareTo(s.substring(i,i+l)) >= 0){
                minString = s.substring(i, i+l);
            }
        }
        System.out.println(minString + "\n" + maxString);
    }
}