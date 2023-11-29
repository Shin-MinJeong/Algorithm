import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(reader.readLine());
        //List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());

        System.out.print(fibo(n));
    }
    /* 피보나치 구현에서 재귀함수를 사용하면 시간이 초과된다.
       매 번 불필요한 연산을 하기 때문에 수행 시간이 계속 늘어남
       따라서 중복 계산을 피해야한다. => 동적계획법 활용
       
        public static int fibo(int n) {
            if(n == 0){
                return 0 ;
            } else if (n == 1) {
                return 1 ;
            } else {
                return fibo(n-2)+fibo(n-1) ;
            }
    }*/
    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;  
        arr[1] = 1;  
        
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}