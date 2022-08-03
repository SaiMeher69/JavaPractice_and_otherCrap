import java.util.*;
import java.io.*;

public class Rain{
    public static void main(String[] args) throws FileNotFoundException, IOException{
        BufferedReader bread = new BufferedReader(new FileReader("D:\\Office stuff\\Practice\\Rain.txt"));
        int num = Integer.parseInt(bread.readLine());
        for(int i = 0; i < num; i++){
            String[] nm = new String[2];
            nm = bread.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            int[] positions = new int[n], intensities = new int[n];
            for(int j = 0; j < n; j++){
                String[] posint = bread.readLine().split(" ");
                positions[j] = Integer.parseInt(posint[0]);
                intensities[j] = Integer.parseInt(posint[1]);
            }
            StringBuffer result = new StringBuffer();
            for(int j = 0; j < n; j++){
                if(isFlood(positions, intensities, j+1, n)){
                    result.append("1");
                }else{
                    result.append("0");
                }
            }
            System.out.println(Arrays.toString(positions));
            System.out.println(Arrays.toString(intensities));
            System.out.println("n: " + n + " m: " + m);
            System.out.println(result.toString());
        }      
        bread.close();
    }
    public static Boolean isFlood(int[] positions, int[] intensities, int day, int num){
        HashMap<Integer, Integer> rainfall = new HashMap<Integer, Integer>();
        for(int i = 0; i < num; i++){
            int minIndex = positions[i] - intensities[i], maxIndex = positions[i] + intensities[i];
            for(int j = minIndex; j <= maxIndex; j++){
				if(rainfall.containsKey(j)){
					int temp = rainfall.get(j);
					rainfall.put(j, temp + Math.max(0, intensities[i] - Math.abs(positions[i] - j)));
				}else{
					rainfall.put(j,Math.max(0, intensities[i] - Math.abs(positions[i] - j)));
				}
            }
        }
        System.out.println(Arrays.asList(rainfall));
        return true;
    }
}