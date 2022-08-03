import java.util.*; 

public class Empty1 {
    static int n;
    static ArrayList<Integer> firstArray= new ArrayList<Integer>();
    static ArrayList<Integer> secondArray= new ArrayList<Integer>();
    
    static int result;
    public static void main(String[] args){

        //Initiating a scanner class
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //populating the arraylists
        for(int i = 0; i < n; i++){
            firstArray.add(sc.nextInt());
        }
        for(int i = 0; i < n; i++){
            secondArray.add(sc.nextInt());
        }
        sc.close();

        //actual working
        while(firstArray.size() != 0){
            if(firstArray.get(0) == secondArray.get(0)){
                firstArray.remove(0);
                secondArray.remove(0);
                result++;
            }else{
                int temp = firstArray.get(0);
                firstArray.remove(0);
                firstArray.add(temp);
                result++;
            }
        }
        System.out.println(result);
    }
}

