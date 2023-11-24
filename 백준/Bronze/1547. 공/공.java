import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        List<String> cup = new ArrayList<String>();

        cup.add("O");
        cup.add("X");
        cup.add("X");

        for (int i=0 ; i<input ; i++){
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            String item = "O" ;

            int X = Integer.parseInt(tokenizer.nextToken());
            int Y = Integer.parseInt(tokenizer.nextToken());

            Collections.swap(cup, (X-1), (Y-1));
        }
        for (int i = 0; i < cup.size(); i++) {
            if (cup.get(i).equals("O")) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}