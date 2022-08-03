
import java.util.*;

public class Series {
    public static void main(String[] args){
        int q,a,b,n;
        Scanner sc = new Scanner(System.in);
        q = sc.nextInt();
        //String garb = sc.nextLine();
        int[][] seriess = new int[100][100];
        int[] num = new int[q];
        for(int i=0; i < q; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            for(int p=0; p < n;p++){
                if(p>0){
                    seriess[i][p] = seriess[i][p-1] + ((int)Math.pow(2,p)) * b;
                }
                else{
                    seriess[i][p] = a + ((int)Math.pow(2,p)) * b;
                }
            }
            num[i] = n;
        }
        sc.close();
        for(int i=0; i<q;i++){
            for(int j=0; j < num[i];j++){
                System.out.printf("%d ",seriess[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
