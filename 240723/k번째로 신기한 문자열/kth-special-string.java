import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String T = st.nextToken();

        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            String str = br.readLine();
            if(str.startsWith(T)){
                arr.add(str);
            }
        }
        Collections.sort(arr);
        System.out.print(arr.get(k-1));
        
    }
}