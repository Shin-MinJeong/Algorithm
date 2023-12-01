import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine()); //배달 해야하는 설탕

        int count = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                count += n / 5;
                break;
            } else {
                n -= 3;
                count++;
            }
        }

        if (n < 0) {
            System.out.println("-1");
        } else {
            System.out.println(count);
        }
    }
}