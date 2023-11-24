import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            String input = reader.readLine();
            String reverseStr = new StringBuilder(input).reverse().toString();

            if(input.equals("0")) {
                break;
            }else{
                if (input.equals(reverseStr)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}