import java.util.*;

public class Anagrams {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        if(s1.length() != s2.length()){
            System.out.println("Not Anagrams");
        }else{
            int[] freqs1 = new int[26];
            Arrays.fill(freqs1, 0);
            int[] freqs2 = new int[26];
            Arrays.fill(freqs2, 0);  
            for(int i=0; i < s1.length(); i++){
                freqs1[((int)s1.toLowerCase().charAt(i)) - 97]++;
                freqs2[((int)s2.toLowerCase().charAt(i)) - 97]++;
            }
            System.out.println(Arrays.toString(freqs1));
            System.out.println(Arrays.toString(freqs2));
            if(Arrays.equals(freqs1, freqs2)){
                System.out.println("Anagrams");
            }else{
                System.out.println("Not Anagrams");
            }
        }
    }
}
