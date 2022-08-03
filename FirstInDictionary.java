import java.util.*;

public class FirstInDictionary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String firstWord = sc.nextLine();
        String secondWord = sc.nextLine();
        sc.close();

        //sum of lengths
        System.out.println(firstWord.length() + secondWord.length());
        //check what comes first in a dictionary
        int equal=0;
        int big = 5;
        for(int i=0; i < Math.min(firstWord.length(), secondWord.length()); i++){
            int diff = (int)firstWord.toLowerCase().charAt(i) - (int)secondWord.toLowerCase().charAt(i);
            if(diff == 0){
                equal++;
                continue;
            }else if(diff > 0){
                big = 1;
                break;
            }else{
                big = 0;
                break;
            }
        }
        if(big == 0){
            System.out.println("No");
        }else if(big == 1){
            System.out.println("Yes");
        }
        if(equal == Math.min(firstWord.length(), secondWord.length())){
            if(firstWord.length() > secondWord.length()){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

        //capitalize the first letter
        String newFirstWord = String.valueOf(firstWord.charAt(0)).toUpperCase() + firstWord.substring(1, firstWord.length());
        String newSecondWord = String.valueOf(secondWord.charAt(0)).toUpperCase() + secondWord.substring(1, secondWord.length());
        System.out.println(newFirstWord + " " + newSecondWord);
    
    }
}
