import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2001];

        int idx = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            String shift = st.nextToken();

            if(shift.equals("R")){
                for(int j=idx; j<idx+x;j++){
                    arr[1000+j+1]++;
                }
                idx+=x;
            }
            else if(shift.equals("L")){
                idx -= x;
                for(int j=idx; j<idx+x; j++){
                    arr[1000+j+1]++;
                }
            }
        }

        int cnt = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>=2){
                cnt++;
            }
        }
        System.out.print(cnt);
    }

}