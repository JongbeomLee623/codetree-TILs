import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<codeName> arr = new ArrayList<codeName>();
        
        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int n = Integer.parseInt(st.nextToken());
            arr.add(new codeName(name, n));
        }
        int min = Integer.MAX_VALUE;
        String cn ="";
        for(int i=0; i<arr.size(); i++){
            int x = arr.get(i).getScore();
            if(min>x){
                min = x;
                cn = arr.get(i).getName();
            }
        }
        System.out.println(cn + " "+min);
    }
}

class codeName {
    String name;
    int score;

    public codeName(String name, int score){
        this.name = name;
        this.score = score;
    }
    public String toString(){
        return name + " " + score;
    }
    public int getScore(){
        return this.score;
    }
    public String getName(){
        return this.name;
    }

    
}