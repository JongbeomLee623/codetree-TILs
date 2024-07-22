import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int ans = 0;
        
        for(int i=0; i<N-2; i++){
            for(int j=0; j<N-2; j++){
                int cnt = countOnes(arr, i,j);
                if(ans<cnt){
                    ans=cnt;
                }
            }
        }
        System.out.print(ans);
        
    }
    public static int countOnes(int[][] arr, int x, int y){
        int cnt =0;
        for(int i=x; i<x+3; i++){
            for(int j=y; j<y+3; j++){
                if(arr[i][j]==1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}