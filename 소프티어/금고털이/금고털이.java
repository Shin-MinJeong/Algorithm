import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] m = new int[n]; //귀금속 무게
        int[] p = new int[n]; //귀금속 무게 당 가격

        Integer[] arr = new Integer[n]; //정렬용 배열

        for(int i=0 ; i<n ; i++) {
            st = new StringTokenizer(br.readLine());
            m[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
            arr[i] = i ;
        }

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return p[b] - p[a]; //내림차순
            }
        });

        int w2 = w ; //남은 배낭 용량
        int total = 0 ;

        for(int i=0 ; i<n && w>0 ; i++) {
            int index = arr[i] ;

            if(m[index] <= w2) {
                total += m[index]*p[index] ;
                w2 -= m[index] ;
            } else {
                total += w2*p[index] ;
                w = 0 ;
            }
        }
        System.out.println(total);

    }
}