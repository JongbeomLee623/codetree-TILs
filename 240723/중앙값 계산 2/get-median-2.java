import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class Main {
    public static ArrayList<Integer> al = new ArrayList<>();
    public static ArrayList<Integer> sortedArray = new ArrayList<>();
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=1; i<=n; i++){
            int x = Integer.parseInt(st.nextToken());
            al.add(x);
            sortedArray.add(x);
            if(i%2!=0){
                Collections.sort(sortedArray);
                sb.append(sortedArray.get(sortedArray.size()/2)).append(" ");
            }
        }
        System.out.print(sb);

    }
}