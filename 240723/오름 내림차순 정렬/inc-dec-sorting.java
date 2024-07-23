import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Main {
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);
        for(int x : arr){
            sb.append(x).append(" ");
        }   
        sb.append("\n");
        Collections.reverse(arr);
        for(int x : arr){
            sb.append(x).append(" ");
        } 
        System.out.print(sb);
    }
}