import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    static StringBuilder sb = new StringBuilder();
    static int K, N;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        
        arr = new int[N];
        dfs(0);

        System.out.print(sb);
    }
    public static void dfs (int k){
        if(k==N){
            for(int value: arr){
                sb.append(value+" ");
            }
            sb.append("\n");
            return;    
        }
        for(int i=1; i<=K; i++){
            arr[k]=i;
            dfs(k+1);
        }
        
    }
}