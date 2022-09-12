import java.util.*;

public class LogEntries{
    public static int finalResult = 0;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] timeStampsString = scanner.nextLine().replace("{","").replace("}","").split(",");
        String[] flagsString = scanner.nextLine().replace("{","").replace("}","").split(",");
        String[] entriesString = scanner.nextLine().replace("{","").replace("}","").split(",");
        scanner.close();
        TreeMap<Integer, Integer> tsflg = new TreeMap<>();
        TreeMap<Integer, Integer> tsent = new TreeMap<>();
        for(int i = 0; i < n; i++){
            tsflg.put(Integer.parseInt(timeStampsString[i]),Integer.parseInt(flagsString[i]));
            tsent.put(Integer.parseInt(timeStampsString[i]),Integer.parseInt(entriesString[i]));
        }
        tsflg.forEach((k,v)->dosmtg(k, v,tsent));
        System.out.println(finalResult);
    }

    public static void dosmtg(int key, int value, TreeMap<Integer, Integer> tsent){
        if(value%5 != 0){
                finalResult += 1;
        }else{
                finalResult -= tsent.get(key);
        }
    }
}