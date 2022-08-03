import java.util.*;
import java.io.*;

public class Path {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("D:\\Office stuff\\Practice\\pathfile.txt");
        BufferedReader read = new BufferedReader(fr);
        String line = new String();
        List<List<String>> pattern = new ArrayList<>();
        while((line=read.readLine()) != null){
            pattern.add(new ArrayList<>(Arrays.asList(line.split(""))));
        }
        int[] spos = new int[2];
        int[] dpos = new int[2];
        //System.out.println(pattern);
        for(int i = 0; i < pattern.size(); i++){
            if(pattern.get(i).contains("d")){
                dpos[0] = i;
                dpos[1] = pattern.get(i).indexOf("d");
            }
            if(pattern.get(i).contains("s")){
                spos[0] = i;
                spos[1] = pattern.get(i).indexOf("s");
            } 
        }
        List<String> pathSD = new ArrayList<>();
        //int verticaldiff = 0;
        int horizantaldiff = 0;
        if(dpos[0] - spos[0] == 0){
            if(dpos[1] - spos[1] > 0){
                for(int i = 0; i < (dpos[1] - spos[1]); i++){
                    pathSD.add("Move right");
                }
            }else{
                for(int i = 0; i < (spos[1] - dpos[1]); i++){
                    pathSD.add("Move left");
                }
            }
        }else if(dpos[1] < spos[1]){
            //go left
            horizantaldiff = spos[1]-dpos[1];
            for(int i = 0; i < (horizantaldiff); i++){
                pathSD.add("Move Left");
            }
            int currentypos = spos[1];
            if(dpos[0] > spos[0]){
                //go down
                int s = getshortestlist(spos[0], dpos[0], pattern);
                if(s < currentypos){
                    for(int i = 0; i < currentypos-s-1; i++){
                        pathSD.add("Move left");
                    }
                    for(int i = 0; i < horizantaldiff-1; i++){
                        pathSD.add("Move Down");
                    }
                    for(int i = 0; i < currentypos-s-1; i++){
                        pathSD.add("Move Right");
                    }
                }else{
                    for(int i = 0; i < horizantaldiff-1; i++){
                        pathSD.add("Move Down");
                    }
                }
                
            }else{
                //go up
                int s = getshortestlist(dpos[0], spos[0], pattern);
                if(s < currentypos){
                    for(int i = 0; i < currentypos-s-1; i++){
                        pathSD.add("Move left");
                    }
                    for(int i = 0; i < horizantaldiff; i++){
                        pathSD.add("Move up");
                    }
                    for(int i = 0; i < currentypos-s-1; i++){
                        pathSD.add("Move Right");
                    }
                }else{
                    for(int i = 0; i < horizantaldiff; i++){
                        pathSD.add("Move up");
                    }
                }
            }
        }else{
            //Go right
            horizantaldiff = dpos[1] - spos[1];
            if(dpos[0] < spos[0]){
                //go up
                int s = getshortestlist(spos[0], dpos[0], pattern);
                if(s < spos[1]){
                    for(int i = 0; i < spos[1]-s-1;i++){
                        pathSD.add("Move Left");
                    }
                    for(int i = 0; i < spos[0]-dpos[0]; i++){
                        pathSD.add("Move up");
                    }
                    for(int i = 0; i < spos[1]-s-1;i++){
                        pathSD.add("Move Right");
                    }
                    for(int i = 0; i < dpos[1] - spos[1]; i++){
                        pathSD.add("Move right");
                    }
                }else{
                    for(int i = 0; i < dpos[0]-spos[0]; i++){
                        pathSD.add("Move Up");
                    }
                    for(int i = 0; i < dpos[1] - spos[1]; i++){
                        pathSD.add("Move right");
                    }
                }
            }else{
                //go down
                int s = getshortestlist(dpos[0], spos[0], pattern);
                if(s < spos[1]){
                    for(int i = 0; i < spos[1]-s-1;i++){
                        pathSD.add("Move Left");
                    }
                    for(int i = 0; i < dpos[0]-spos[0]; i++){
                        pathSD.add("Move Down");
                    }
                    for(int i = 0; i < spos[1]-s-1;i++){
                        pathSD.add("Move Right");
                    }
                    for(int i = 0; i < dpos[1] - spos[1]; i++){
                        pathSD.add("Move right");
                    }
                }else{
                    for(int i = 0; i < dpos[0]-spos[0]; i++){
                        pathSD.add("Move Down");
                    }
                    for(int i = 0; i < dpos[1] - spos[1]; i++){
                        pathSD.add("Move right");
                    }
                }
            }
        }
        //System.out.println("S positions: " + spos[0] + " " + spos[1] + " D positions: " + dpos[0] + " " + dpos[1]);
        //System.out.println(verticaldiff + horizantaldiff);
        System.out.println(pathSD);
        read.close();
        fr.close();
    }

    public static int getshortestlist(int a,int b, List<List<String>> p){
        int l = 0;
        for(int i = a; i < b; i++){
            if(l > p.get(i).size()){
                l = p.get(i).size();
            }
        }
        return l;
    }
}
