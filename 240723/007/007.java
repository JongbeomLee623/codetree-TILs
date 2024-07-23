import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String sc = st.nextToken();
        String mp = st.nextToken();
        String t = st.nextToken();

        _007 a = new _007(sc, mp, t);
        System.out.print(a);
    }
}

class _007 {
    String secretCode;
    String meetingPoint;
    String time;
    public _007(String sc, String mp, String t){
        this.secretCode = sc;
        this.meetingPoint = mp;
        this.time = t;
    }
    public String toString(){
        return "secret code : "+secretCode +"\n"+
        "meeting point : " + meetingPoint + "\n"+
        "time : " +time;
    }
}