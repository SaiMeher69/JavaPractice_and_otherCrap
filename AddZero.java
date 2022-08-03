
import java.util.*;

public class AddZero {
    public String i;
    
    public AddZero(int a){
        this.i = Integer.toString(a);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        scanner.close();
        AddZero demo = new AddZero(myInt);
        //System.out.println(((Object)Integer.parseInt(demo.i)).getClass().getSimpleName());
        
        if(Integer.parseInt(demo.i)<100){
            if(Integer.parseInt(demo.i)<10){
                demo.i = demo.addZero(demo.i);
            }
            demo.i = demo.addZero(demo.i);
        }
        System.out.println(demo.i);
    }
    public String addZero(String str){
        String temp = String.join("","0",str);
        return temp;
    }
}
