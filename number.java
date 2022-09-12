import java.util.Scanner;

public class number{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 2;
        int result = 0;
        Boolean found = false;
        while(i<1000 && found == false){
            result = n * i;
            if(findSum(result) == n){
                found = true;
            }
            i++;
        }
        scanner.close();
        if(found){
            System.out.println("final result: " + result);
        }else{
            System.out.println("not found"); 
        }
    }

    public static int findSum(int num){
        int result = 0;
        while(num>0){
            result = result + num%10;
            num = num/10;
        }
        return result;
    }
}