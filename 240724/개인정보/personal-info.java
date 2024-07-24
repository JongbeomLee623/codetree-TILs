import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Person> arr = new ArrayList<Person>();

        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            float weight = Float.parseFloat(st.nextToken());
            arr.add(new Person(name, height, weight));

        }
         // 이름순 정렬
        Collections.sort(arr, new NameComparator());
        System.out.println("name");
        for (Person pr : arr) {
            System.out.println(pr);
        }

        System.out.println();

        // 키순 정렬
        Collections.sort(arr, new HeightComparator());
        System.out.println("height");
        for (Person pr : arr) {
            System.out.println(pr);
        }
    }
}

class Person {

    private String name;
    private int height;
    private float weight;

    public Person(String name, int height, float weight){
        this.name = name;
        this.height = height;
        this.weight = weight;

    }

    public String getName(){
        return this.name;
    }

    public int getHeight(){
        return this.height;
    }

    public float getWeight(){
        return this.weight;
    }

    public String toString(){
        return this.name + " " + this.height + " " + this.weight;
    }
}


// 이름순 정렬을 위한 Comparator
class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

// 키순 정렬을 위한 Comparator
class HeightComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p2.getHeight(), p1.getHeight());
    }
}