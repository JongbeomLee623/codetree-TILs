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
        ArrayList<forecast> arr = new ArrayList<forecast>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String date, day, weather;
            date = st.nextToken();
            day = st.nextToken();
            weather = st.nextToken();
            arr.add(new forecast(date, day, weather));
        }
        Collections.sort(arr);
        for(forecast fc : arr){
            if(fc.getRainnyDay()){
                System.out.println(fc);
                break;
            }
        }
    }
}

class forecast implements Comparable<forecast> {
    private String date;
    private String day;
    private String weather;

    public forecast(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    public String toString(){
        return this.date + " " + this.day +" " + this.weather;
    }

    @Override
    public int compareTo(forecast fc){
        return this.date.compareTo(fc.date);
    }

    public String getDate(){
        return this.date;
    }

    public boolean getRainnyDay(){
        if(this.weather.equals("Rain")){
            return true;
        }
        else{
            return false;
        }
    }

}