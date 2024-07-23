import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class Main {
    public static int a, b;
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());   

        arr.add(a);
        arr.add(b);

        cbv(a,b);
        
        for(int x : arr){
            System.out.print(x+ " ");
        }
   
    }
    public static void cbv(int x, int y){
        if(x > y){
            arr.set(0, x*2);
            arr.set(1, y+10);
        }
        else {
            arr.set(0,x+10);
            arr.set(1, y*2);        }
    }
}