import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        List<String> list = new ArrayList<>();
        int sum = 0;

        for(int i=0 ; i<5 ; i++) {
            list.add(st.nextToken());

            int number = Integer.parseInt(list.get(i));
            int squared = number * number;

            sum += squared;

        }
        System.out.println(sum%10);
    }
}
