import java.util.*;

public class HashMapsss {
    public static void main(String[] args){
        HashMap<String, Integer> phonebook = new HashMap<String, Integer>();
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < n; i++){
            String name = scan.nextLine();
            int number = Integer.parseInt(scan.nextLine());
            phonebook.put(name,number);
        }
        while(scan.hasNextLine()){
            String query = scan.nextLine();
            if(phonebook.containsKey(query)){
                System.out.println(phonebook.get(query));
            }else{
                System.out.println("Not found");
            }
        }
        scan.close();
    }
}
