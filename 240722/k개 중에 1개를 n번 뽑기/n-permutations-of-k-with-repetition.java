import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        pm(K,N);
        System.out.print(sb);


    }
    public static void pm (int x, int y){
        for(int i = 1; i<=x; i++){
            for(int j = 1; j<=y; j++){
                sb.append(i + " "+ j);
                sb.append("\n");
            }
        }
    }
}