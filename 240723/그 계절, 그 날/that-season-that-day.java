import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static boolean leapYear;
    public static int date;
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Y = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        getLeapYear(Y);

        if(!getDate(M, D)){
            System.out.print(-1);
        } else{
            System.out.print(getSeason(M));
            
        }
        
    }

    public static String getSeason(int n){
        if(n<=2 || n==12){
            return "Winter";
        }
        else if(n>=3 || n<=5) {
            return "Spring";
        }
        else if(n>=6 || n<=8) {
            return "Summer";
        }
        else if(n>=9 || n<=11) {
            return "Fall";
        } else {
            return "-1";
        }
    }

    public static boolean getDate(int m, int d){
        if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m == 12 ){
            date = 31;
        }
        else if (m==4 || m==6 || m==9 || m==11){
            date = 30;
        }

        else if (m ==2) {
            if(leapYear) {
                date = 29;
            } else{
                date = 28;
            }
        }

        else{
            return false;
        }

        if(d<=0 || date < d){
            return false;
        }
        else{
            return true;
        }
    }

    public static void getLeapYear(int y){
        if(y%400==0){
            leapYear = true;
        }
        else if(y%100==0){
            leapYear = false;
        }
        else if(y%4==0){
            leapYear = true;
        }
        else {
            leapYear = false;
        }
    }
}