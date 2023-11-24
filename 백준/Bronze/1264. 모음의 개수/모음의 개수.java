import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            String input = reader.readLine().toLowerCase();
            int count=0;
            //String input = new String[]{reader.readLine()};
            //String reverseStr = new StringBuilder(input).reverse().toString();

            if(input.equals("#")) {
                break;
            }else{
                for(int i=0 ; i<input.length(); i++) {
                    if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u') {
                        count ++ ;
                    }
                }
                System.out.println(count);
                }
            }
        }
    }