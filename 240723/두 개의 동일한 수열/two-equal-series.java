import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            A.add(Integer.parseInt(st.nextToken()));    
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            B.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(A);
        Collections.sort(B);
        
        boolean x = true;
        for(int i=0; i<n; i++){
            if(A.get(i)!=B.get(i)){
                x = false;
                break;
            }
        }
        System.out.print(x?"Yes":"No");

    }
}