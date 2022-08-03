import java.io.*;
import java.util.*;

public class NQueen {
    public static List<Integer> cols = new ArrayList<Integer>();
    public static List<Integer> posDiag = new ArrayList<Integer>();
    public static List<Integer> negDiag = new ArrayList<Integer>();
    public static String[][] board;
    public static int n;
    public static Boolean oneSolution = true;
    public static int one = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bread.readLine());
        bread.close();
        String[][] b = new String[n][n];
        for(String[] row: b){
            Arrays.fill(row, ".");
        }
        board = b;
        backTrack(0);
    }
    public static void backTrack(int r){
        if(r==n){
            System.out.println("Solution: ");
            for(String[] row: board){
                System.out.println(Arrays.toString(row));
            }
            if(oneSolution){
                one++;
            }
            return;
        }
        for(int c = 0; c < n; c++){
            if(cols.contains(c) || negDiag.contains(r-c) || posDiag.contains(r+c)){
                continue;
            }
            if(one == 1){
                return;
            }
            cols.add(c);
            negDiag.add(r-c);
            posDiag.add(r+c);
            board[r][c] = "Q";  
            backTrack(r+1);
            cols.remove(cols.indexOf(c));
            negDiag.remove(negDiag.indexOf(r-c));
            posDiag.remove(posDiag.indexOf(r+c));
            board[r][c] = ".";
        }
    }
}
