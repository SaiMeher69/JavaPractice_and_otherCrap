import java.util.*;

public class Stringtokens {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        sc.close();
        String temp = inp.replace("!"," ").replace("'", " ").replace(","," ").replace("?"," ").replace("@"," ").replace("_"," ");
        String temp1 = temp.replaceAll("//s+"," ");
        //System.out.println(temp1);
        ArrayList<String> tokens = new ArrayList<String>(Arrays.asList(temp1.split(" ")));
        System.out.println(tokens.size());
        for(int i = 0; i < tokens.size(); i++){
            System.out.println(tokens.get(i));
        }
    }
}
