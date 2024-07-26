import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Point> arr = new ArrayList<Point>();

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());

            int x, y;
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            arr.add(new Point(x, y, i+1));

        }
        Collections.sort(arr);
        for(Point p : arr){
            System.out.println(p);
        }
    }
}

class Point implements Comparable<Point> {
    private int x;
    private int y;
    private int i;
    private double dist;

    public Point(int x, int y, int i){
        this.x = x;
        this.y = y;
        this.i = i;
        this.dist = Math.abs(this.x) + Math.abs(this.y);
    }

    public String toString(){
        return Integer.toString(i);
    }

    @Override
    public int compareTo(Point p){
        if(this.dist > p.dist){
            return 1;
        } else if(this.dist < p.dist){
            return -1;
        } else {
            return 0;
        }
    }
}