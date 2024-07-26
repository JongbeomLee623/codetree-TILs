import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Student> arr = new ArrayList<Student>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int h, w;
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            arr.add(new Student(h, w, i+1));
        }
        Collections.sort(arr);
        for(Student x : arr){
            System.out.println(x);
        }
    }
}

class Student implements Comparable<Student>{
    private int h;
    private int w;
    private int k;

    public Student(int h, int w, int k){
        this.h = h;
        this.w = w;
        this.k = k;
    }

    public int getH(){
        return this.h;
    }
    public int getW(){
        return this.w;
    }
    public int getK(){
        return this.k;
    }

    @Override
    public int compareTo(Student st){
        int hCompare = Integer.compare(this.h, st.h);
        if(hCompare != 0){
            return hCompare;
        }

        int wCompare = Integer.compare(st.w, this.w);
        if(wCompare != 0){
            return wCompare;
        }
        int kCompare = Integer.compare(st.k, this.k);
        return kCompare;
    }

    public String toString(){
        return this.h +" " + this.w + " " + this.k;
    }

}