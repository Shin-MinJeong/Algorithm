import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> number = new ArrayList<>();
        List<Integer> list   = new ArrayList<>();

        //1부터 30까지 배열에 넣고
        for(int i=0 ; i<30 ; i++) {
            number.add(i+1) ;
        }
        //받을 수를 number와 비교
        for(int i=0 ; i<28 ; i++) {
            list.add(Integer.valueOf(reader.readLine()));
        }
        Collections.sort(list);

        List<Integer> result = new ArrayList<>(number);
        result.removeAll(list); //중복되는거 지움

        for (int i=0 ; i<result.size() ; i++) {
            System.out.println(result.get(i));
        }
    }
}