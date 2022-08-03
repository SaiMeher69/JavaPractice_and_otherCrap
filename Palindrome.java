import java.util.*;
//import java.io.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        if(sb.reverse().toString().equals(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

