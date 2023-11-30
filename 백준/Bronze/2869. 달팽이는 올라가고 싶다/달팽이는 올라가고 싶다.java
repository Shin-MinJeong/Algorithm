import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        while (st.hasMoreTokens()) {
            list.add(Integer.valueOf(st.nextToken()));
        }

        int A = list.get(0);
        int B = list.get(1);
        int V = list.get(2);

        int day = (V-B) / (A-B) ;

        //이 때 마지막날에는(도착) 내려가면 안됨
        if((V-B) % (A-B) != 0) {
            day++ ;
        }
        System.out.println(day);
    }
}