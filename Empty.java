import java.util.*; 

public class Empty {
    static int n;
    static String[] fa;
    static String[] sa;
    static ArrayList<Integer> firstArray= new ArrayList<Integer>();
    static ArrayList<Integer> secondArray= new ArrayList<Integer>();
    
    static int result;
    public static void main(String[] args){

        //Initiating a scanner class
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //getting rid of the extra new line character
        String garb = sc.nextLine();

        //Splitting the taken input into string arrays and closing the scanner
        fa = sc.nextLine().split(" ",-1);
        sa = sc.nextLine().split(" ",-1);
        sc.close();

        //populating the arraylists
        for(int i = 0; i < n; i++){
            firstArray.add(Integer.parseInt(fa[i]));
            secondArray.add(Integer.parseInt(sa[i]));
        }
        
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
