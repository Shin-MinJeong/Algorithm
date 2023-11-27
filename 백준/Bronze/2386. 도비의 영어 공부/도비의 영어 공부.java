import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = reader.readLine();
            
            if (str.equals("#")) break;
            
            String[] strArr = str.toLowerCase().split("");
            
            int count = 0;
            
            for (int i = 0; i < strArr.length; i++) {
                if (str.split(" ")[0].equals(strArr[i]))
                    count++;
            }
            System.out.println(str.split(" ")[0] + " " + (count - 1));
        }
    }
}
