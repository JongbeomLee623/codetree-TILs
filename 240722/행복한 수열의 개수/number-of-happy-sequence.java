import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ans =0;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                int x = Integer.parseInt(st.nextToken());
                arr[i][j] = x;
            }
        }

        // 가로 수열 확인
        for(int i=0; i<n; i++){
            int cnt = m;
            int temp = 0;
        
            for(int j=0; j<n; j++){
                if(cnt==1){
                    ans++;
                    break;
                }
                if(temp!=arr[i][j]){
                    temp = arr[i][j];
                    cnt = m;
                } else{
                    cnt--;
                    if(cnt==1){
                        ans++;
                        break;
                    }
                }
            }
        }

        // 세로 수열 확인
        for(int i=0; i<n; i++){
            int cnt = m;
            int temp = 0;
            for(int j=0; j<n; j++){
                if(cnt==1){
                    ans++;
                    break;
                }
                if(temp!=arr[j][i]){
                    temp = arr[j][i];
                    cnt = m;
                } else{
                    cnt--;
                    if(cnt==1){
                        ans++;
                        break;
                    }
                }
            }
            }

        System.out.print(ans);
        

    }
    
}