import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(reader.readLine());

        List<Integer> list = new ArrayList<>();
        int sum = 0 ;   //합계

        for (int i=0 ; i<9 ; i++) {
            int num = Integer.parseInt(reader.readLine());
            list.add(num);
            sum += num ;
        }
        //오름차순
        Collections.sort(list);

        int x = 0 ;
        int y = 0 ;

        //두 수를 선택
        for(int i=0 ; i<list.size() ; i++) {
            for(int j=0 ; j<list.size() ; j++) {
                //현재 선택된 두 수를 제외한 나머지 수들의 합
                //7명의 합이 100을 만족하면 x와 y에 값을 저장한다.
                if((sum - list.get(i) - list.get(j)) == 100) {
                    x = i ;
                    y = j ;
                }
            }
        }
        for(int i=0 ; i<list.size() ; i++) {
        //x와 y에 저장된 값을 제외한 나머지를 출력한다.    
            if(i != y && i != x) {
                System.out.println(list.get(i));
            }
        }
    }
}