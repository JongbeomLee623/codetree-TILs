import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Main {
    public static int N;
    public static ArrayList<Integer> arr =  new ArrayList<>();
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N*2; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }   

        int max = Integer.MIN_VALUE;
        Collections.sort(arr);

        for(int i=0; i<N; i++){
            int r = arr.get(i)+arr.get(arr.size()-1-i);
            if(r > max){
                max = r;
            }
        }

        System.out.print(max);
    }
}