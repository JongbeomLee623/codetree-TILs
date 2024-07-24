import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        ArrayList<info> arr = new ArrayList<info>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            String name, addr, city;
            name = st.nextToken();
            addr = st.nextToken();
            city = st.nextToken();
            arr.add(new info(name,addr,city));
        }
        
        Collections.sort(arr);

        System.out.print(arr.get(n-1));
    }

}

class info implements Comparable<info>{
    private String name;
    private String addr;
    private String city;

    public info(String name, String addr, String city){
        this.name = name;
        this.addr = addr;
        this.city = city;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return "name " + this.name + "\n" +
            "addr " +this.addr+"\n" +
            "city " +this.city;
    }
    
    @Override
    public int compareTo(info inf) {
        return this.name.compareTo(inf.name);
    }

}