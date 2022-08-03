import java.util.*;

public class Roll6 {
    public static void main(String[] args){
        int result = 0;
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        sc.close();
        char[] rolls = inp.toCharArray();
        int validcheck = 1;
        for(int i = 0; i < rolls.length; i++){
            if(Integer.parseInt(String.valueOf(rolls[i])) > 6 || Integer.parseInt(String.valueOf(rolls[i])) == 0){
                validcheck = 0;
            }
        }
        if(validcheck == 0 || (rolls[rolls.length-1] == '6')){
            System.out.println("Invalid");
        }else{
            for(int i = 0; i < rolls.length; i++){
                if(rolls[i] != '6'){
                    result++;
                }
            }
            System.out.println("Number of girls: " + result);
        }       
    }
}
