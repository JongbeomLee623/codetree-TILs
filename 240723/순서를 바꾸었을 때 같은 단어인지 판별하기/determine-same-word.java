import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> A = new ArrayList<>();
        ArrayList<Character> B = new ArrayList<>();
        
        String a = br.readLine();
        for(int i=0; i<a.length(); i++){
            A.add(a.charAt(i));
        }
        String b = br.readLine();
        for(int i=0; i<b.length(); i++){
            B.add(b.charAt(i));
        }
        
        Collections.sort(A);
        Collections.sort(B);

        boolean flag = true;
        for(int i=0; i<Math.max(A.size(),B.size());i++){
            try {
                if(A.get(i)!=B.get(i)){
                    flag = false;
                }
            }
            catch(Exception e1) {
                flag = false;
            }
        }
        System.out.print(flag?"Yes":"No");
    }
}