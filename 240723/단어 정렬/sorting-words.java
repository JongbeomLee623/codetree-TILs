import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class Main {
    public static ArrayList<String> arr = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            String str = br.readLine();
            arr.add(str);
        }

        Collections.sort(arr);
        for(String str: arr){
            System.out.println(str);
        }

    }
}