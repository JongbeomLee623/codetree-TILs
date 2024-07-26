import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        ArrayList<Sequence> arr = new ArrayList<Sequence>();
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int n = Integer.parseInt(st.nextToken());
            arr.add(new Sequence(n, i+1));
            
        }

        Collections.sort(arr);

        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.size(); j++){
                if(arr.get(j).getIndex() == i+1){
                    System.out.print(j+1+" ");
                }
            }
        }

    }
}

class Sequence implements Comparable<Sequence> {
    private int origin;
    private int index;

    public Sequence(int n, int i){
        this.origin = n;
        this.index = i;
    }

    public String toString(){
        return this.index + " ";
    }

    public int getIndex(){
        return this.index;
    }

    @Override
    public int compareTo(Sequence sq){
        return Integer.compare(this.origin, sq.origin);
    }
}