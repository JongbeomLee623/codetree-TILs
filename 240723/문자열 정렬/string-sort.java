import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class Main {
    public static ArrayList<Character> arr = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i=0; i<str.length(); i++){
            arr.add(str.charAt(i));
        }
        Collections.sort(arr);
        for(char c: arr){
            System.out.print(c);
        }

    }
}