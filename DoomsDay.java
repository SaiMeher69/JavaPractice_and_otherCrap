import java.util.*;
//import java.io.*;

public class DoomsDay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        sc.close();

        //find the doomsday
        int century = year - year%100;
        int centurycode = 2;
        switch((century/100)%4){
            case 0: 
                centurycode = 2;
                break;
            case 1:
                centurycode = 0;
                break;
            case 2:
                centurycode = 5;
                break;
            case 3:
                centurycode = 3;
                break;
            default: 
                break;
        }
        int twelves = (year%100)/12;
        int remtwelves = (year%100)%12;
        int remfours = remtwelves/4;
        int sum = centurycode + twelves + remtwelves + remfours;
        while(sum>6){
            sum = sum -7;
        }
        //System.out.printf("century: %d, centurycode: %d, twelves: %d, remtwelves: %d, remfours: %d, Sum: %d, finalsum: %d\n", century, centurycode, twelves, remtwelves, remfours, centurycode + twelves + remtwelves + remfours, sum);
        //doomsday for the month
        int doomsday = 0;
        switch(month){
            case 1:
                if(year%4 == 0){
                    doomsday = 4;
                }else{
                    doomsday = 3;
                }
                break;
            case 2:
                if(year%4 == 0){
                    doomsday = 29;
                }else{
                    doomsday = 28;
                }
                break;
            case 3:
                doomsday = 14;
                break;
            case 4:
                doomsday = 4;
                break;
            case 5:
                doomsday = 9;
                break;
            case 6:
                doomsday = 6;
                break;
            case 7:
                doomsday = 11;
                break;
            case 8:
                doomsday = 8;
                break;
            case 9:
                doomsday = 5;
                break;
            case 10:
                doomsday = 10;
                break;
            case 11:
                doomsday = 7;
                break;
            case 12:
                doomsday = 12;
                break;
            default:
                System.out.println("enter a valid month");
                break;
        }
        //System.out.printf("Month: %d, DoomsDay: %d\n", month, doomsday);
        //finding the day for the given date
        int res;
        //int temp = doomsday;
        String day = "";
        res = date-doomsday + sum;
        while(res > 6){
            res = res-7;
        }
        while(res < 0){
            res = res+7;
        }
        //System.out.printf("Date: %d, doomsDay: %d, res: %d\n", date, doomsday, res);
        switch(res){
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;            
            case 3:
                day = "Wednesday";
                break;            
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
        }
        System.out.printf("On %d-%d-%d ,it was %s\n", date, month, year, day);
        
    }
}
