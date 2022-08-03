import java.util.*;

public class LeapGame {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int n = Integer.parseInt(scan.nextLine());
            while(n--!=0){
                int size = scan.nextInt();
                int leap = scan.nextInt();
                int[] game = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                canWin(game,leap);
            }
            scan.close();
        }

        public static void canWin(int[] arr, int leap){
            if(solve(arr,leap, new Boolean[arr.length], 0)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

        public static Boolean solve(int[] arr, int leap, Boolean[] visited, int currIndex){
            if(currIndex + leap > arr.length || currIndex == arr.length-1){
                return true;
            }
            Boolean[] newVisited = new Boolean[arr.length];
            Arrays.fill(visited, false);
            newVisited = visited.clone();
            Boolean result = false;
            if(!visited[currIndex+1] && arr[currIndex+1] == 0){
                newVisited[currIndex+1] = true;
                result = solve(arr, leap, newVisited, currIndex+1);
            }
            if(result){
                return result;
            }
            if(!visited[currIndex + leap] && arr[currIndex + leap] == 0){
                newVisited[currIndex + leap] = true;
                result = solve(arr, leap, newVisited, currIndex + leap);
            }
            if(result){
                return true;
            }
            if(!visited[currIndex - 1] && arr[currIndex - 1] == 0 && currIndex > 0){
                newVisited[currIndex - 1] = true;
                result = solve(arr,leap, newVisited, currIndex -1);
            }
            if(result){
                return true;
            }
            return result;
        }      
}
