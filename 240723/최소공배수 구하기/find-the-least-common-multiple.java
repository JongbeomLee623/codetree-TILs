import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st. nextToken());
        int m = Integer.parseInt(st. nextToken());
        lcm(n, m);
        
    }
    public static void lcm(int n, int m){
        int lcm = 0;
        lcm = (n * m) / gcd(n,m);

        System.out.print(lcm);
    }

    public static int gcd(int n, int m){
        int r = 0;
        while(m!=0){
            r = n%m;
            n = m;
            m = r;
        }
        return n;
    }
    
}