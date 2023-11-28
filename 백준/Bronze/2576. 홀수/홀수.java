import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(reader.readLine());

        List<Integer> list = new ArrayList<>();

        int sum = 0 ;   //합계

        for (int i = 0; i < 7; i++) {
            int num = Integer.parseInt(reader.readLine());

            if (num % 2 == 1) {
                list.add(num);
                sum += num;
            }
        }
        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);

            int min = Integer.MAX_VALUE;
            for(int num=0 ; num<list.size() ; num++) {
                min = Math.min(min, list.get(num));
            }
            System.out.println(min);
        }
    }
}