import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        ArrayList<Integer> array = new ArrayList<>();

        int size = Integer.parseInt(reader.readLine());

        for (int i=0; i < size; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(array);

        for (int value : array) {
            builder.append(value).append('\n');
        }
        System.out.println(builder);
    }
}