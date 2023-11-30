import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        int c = Integer.parseInt(reader.readLine()) ; //테스트 케이스의 개수

        for (int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine()) ;
            int n = Integer.parseInt(st.nextToken()) ; //테스트 케이스의 학생 수
            ArrayList<Integer> score = new ArrayList<>() ; //점수

            double sum = 0 ;

            for (int j=0 ; j<n ; j++) {
                int s = Integer.parseInt(st.nextToken()) ;
                score.add(s) ;
                sum += s ;
            }

            double avg = sum / n ;
            int count = 0 ;

            for (int s : score) {
                if (s > avg) {
                    count++ ;
                }
            }
            double ratio = (double) count / n * 100 ;
            System.out.printf("%.3f%%\n", ratio) ;
        }
    }
}