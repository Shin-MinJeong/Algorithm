import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int t = n ;
        int cnt=0 ;

        while (true) {
            int left  = t/10 ;
            int right = t%10 ;

            t = (right * 10) + ((left + right) % 10);

            cnt ++ ;

            if(n==t) break;
        }
        System.out.println(cnt);
    }
}