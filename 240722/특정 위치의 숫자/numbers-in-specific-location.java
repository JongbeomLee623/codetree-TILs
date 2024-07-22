import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum =0;
        for(int i=0; i<10;i++){
            int x = Integer.parseInt(st.nextToken());
            if(i==2 || i==4 || i==9){
                sum+=x;
            } 
        }
        System.out.print(sum);
    }
}