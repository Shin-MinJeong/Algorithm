import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine()); //테스트 케이스의 개수
        ArrayList<String> list = new ArrayList<>();

        for(int i=0 ; i<n ; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            list.add(st.nextToken());
        }

        for(int i = 0; i < list.size(); i++) {
            int count = 0;
            int sum = 0;

            for(char c : list.get(i).toCharArray()) {
                if(c == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}