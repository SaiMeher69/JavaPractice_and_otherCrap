import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        line = line.substring(1,line.length()-1);
        List<Integer> cardValues = Arrays.stream(line.split(",")).map(Integer::parseInt).toList();
        System.out.println(cardValues.toString());
        scanner.close();
        int finalSum = cardValues.stream().mapToInt(Integer::intValue).sum() - 2 * flip(cardValues);
        System.out.println(finalSum);
    }
    public static int flip(List<Integer> values){
        int result = 0;
        for(int i = 0; i < values.size(); i++){
            int sum = 0;
            for(int j = i; j < values.size(); j++){
                int point = values.get(j);
                if(point < 0){
                    sum = sum + point;
                }else{
                    break;
                }
            }
            if(result > sum){
                result = sum;
            }
        }
        return result;
    }
}

