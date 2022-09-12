import java.io.*;
import java.util.*;
public class CardGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(scanner.nextLine());
            int[] scores = {0,0,0};
            List<String> player1 = Arrays.asList(scanner.nextLine().split(" "));
            List<String> player2 = Arrays.asList(scanner.nextLine().split(" "));
            List<String> player3 = Arrays.asList(scanner.nextLine().split(" "));
            List<List<String>> words = new LinkedList<>();
            words.add(player1);
            words.add(player2);
            words.add(player3);
            System.out.println(words);
            Map<String,Integer> occurances = new HashMap<>();
            for(List<String> player: words){
                for(String word: player){
                    if(!occurances.containsKey(word)){
                        occurances.put(word,1);
                    }else{
                        occurances.put(word,occurances.get(word)+1);
                    }
                }
            }
            System.out.println(occurances);
            for(int j=0; j < 3; j++){
                for(String word: occurances.keySet()){
                    if(words.get(j).contains(word)){
                        switch(occurances.get(word)){
                            case 1:
                                scores[j] += 3;
                                break;
                            case 2:
                                scores[j] += 1;
                                break;
                            case 3:
                                scores[j] += 0;
                                break;
                            default:
                                System.out.println("dont know how this happened but sure");
                                break;
                        }
                    }
                }   
            }
            System.out.println(Arrays.toString(scores));
        }
        scanner.close();
    }
}