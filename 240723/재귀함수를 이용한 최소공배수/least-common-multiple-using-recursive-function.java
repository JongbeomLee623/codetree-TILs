import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static int[] arr;
    public static int[] ans;
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        ans = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            ans[i] = 1;
        }

        for(int i=1; i<=n; i++){
            ans[i]=lcm(arr[i-1],ans[i-1]);
        }

        System.out.print(ans[n]);
    }
    public static int gcd(int a, int b){
        int r = a % b;
        while(b!=0){
            r = a % b;
            a = b;
            b = r;
        }
        
        return a;
    }
    
    public static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }


}