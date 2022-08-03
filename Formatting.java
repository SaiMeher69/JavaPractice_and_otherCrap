
import java.util.*;

public class Formatting {
    String a;
    public Formatting(String i){
        this.a = i;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[3];
        String[] numbers = new String[3];

        for(int i = 0; i < 3; i++){
            String str = scanner.next();
            int p = scanner.nextInt();
            //String garbage = scanner.nextLine();
            int strlength = str.length();
            Formatting haha = new Formatting(Integer.toString(p));
            if(Integer.parseInt(haha.a)<100){
                if(Integer.parseInt(haha.a)<10){
                    haha.a = haha.addZero(haha.a);
                }
                haha.a = haha.addZero(haha.a);
            }
            for(int k = 0; k < 15-strlength; k++){
                str = haha.addSpace(str);
            }
            words[i] = str;
            numbers[i] = haha.a;
        }
        System.out.println("================================");
        for(int p = 0; p < 3; p++){
            System.out.printf("%s%s\n", words[p], numbers[p]);
        }
        System.out.println("================================");
        scanner.close();
        }
    public String addSpace(String str){
        String string1 = str + " ";
        return string1;
    }
    public String addZero(String str){
        String temp = String.join("","0",str);
        return temp;
    }

}