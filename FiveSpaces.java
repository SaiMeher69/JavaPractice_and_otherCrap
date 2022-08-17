import java.util.Scanner;

public class FiveSpaces {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a five letter String");
        String input = scan.nextLine();
        if(input.length() != 5){
            System.out.println("Enter a five letter String or get out");
        }else{
            char[] arr = {' ',' ',' ',' ',' ',input.charAt(0),input.charAt(1),input.charAt(2),input.charAt(3),input.charAt(4)};
            System.out.println(arr);
        }
        scan.close();
    }
}