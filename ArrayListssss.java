
import java.util.*;
import java.util.stream.Collectors; 

public class ArrayListssss {
    public static void main(String[] args){
        List<List<Integer>> arraylists = new ArrayList<>();
        List<List<Integer>> querylist = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        while(n--!= 0){
            List<Integer> lll = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            arraylists.add(lll);
        }
        int n1 = Integer.parseInt(scan.nextLine());
        while(n1--!= 0){
            List<Integer> temp = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            querylist.add(temp);
        }
        scan.close();
        System.out.println(arraylists);
        System.out.println(querylist);
        for(int i = 0; i < querylist.size(); i++){
            try{
                System.out.println(arraylists.get(querylist.get(i).get(0)-1).get(querylist.get(i).get(1)));
            }catch(IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }    
        }
    }
}
