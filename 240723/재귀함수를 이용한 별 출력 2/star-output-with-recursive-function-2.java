import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        star(N);
        System.out.print(sb);
    }
    public static void star(int n){
        if(n==0) return;
        for(int i=0; i<n; i++){
            sb.append("* ");
        }
        sb.append("\n");
        star(n-1);
        for(int i=0; i<n; i++){
            sb.append("* ");
        }
        sb.append("\n");
        return;
    }
}