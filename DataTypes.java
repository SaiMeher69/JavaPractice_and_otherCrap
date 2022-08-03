
import java.util.*;
import java.math.*;

public class DataTypes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        //BigInteger max = new BigInteger.valueOf(9223372036854775807L);
        for(int i=0;i<n;i++){
            BigInteger a = sc.nextBigInteger();
            Long ha = a.longValue();
            if(a.equals(BigInteger.valueOf(ha))){
                System.out.println(a + " can be fitted in:");
                if(ha.compareTo(2147483647L)<=0 && ha.compareTo(-2147483648L)>=0){
                    if(ha.compareTo(32767L)<=0 && ha.compareTo(-32768L)>=0){
                        if(ha.compareTo(127L)<=0 && ha.compareTo(-128L)>=0){
                            System.out.println("* byte");
                        }
                        System.out.println("* short");
                    }
                    System.out.println("* int");
                }
                System.out.println("* long");
            }
            else{
                System.out.println(a + " can't be fitted anywhere.");
            }          
        }     
        sc.close();
    }
}
