import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        double max = 0 ;
        double maxScore = 0 ;
        StringTokenizer st = new StringTokenizer(reader.readLine());

        List<Double> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            double score = Double.parseDouble(st.nextToken());
            list.add(score);
            max = Math.max(score, max);
        }

        for (int i = 0; i < list.size(); i++) {
            maxScore += ((list.get(i) / max)*100);
        }
        System.out.println(maxScore/list.size());
    }
}