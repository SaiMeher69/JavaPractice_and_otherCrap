//import java.util.*;

public class BubbleSort {
    public static void main(String[] args){
        int[] numbers = {5,4,3,2,1};
        for(int i = 0; i < numbers.length-1;i++){
            for(int j = 0; j < numbers.length-1;j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
            display(numbers);
        }
        display(numbers);
    }   
    public static void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.printf("\n");
    } 
}
