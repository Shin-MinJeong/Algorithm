import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N + 1];

        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            //경우 1. 1을 뺀다
            dp[i] = dp[i - 1] + 1;

            //경우 2. 2로 나누어 떨어지면 2로 나눈다
            if (i % 2 == 0) {
                if (dp[i / 2] + 1 < dp[i]) { //dp[i] 보다 연산 횟수가 적을 경우
                    dp[i] = dp[i / 2] + 1; //연산 횟수를 세야하니 배열에 +1
                }
            }
            //경우 3. 3으로 나누어 떨어지면 3으로 나눈다.
            if (i % 3 == 0) {
                if (dp[i / 3] + 1 < dp[i]) { //dp[i] 보다 연산 횟수가 적을 경우
                    dp[i] = dp[i / 3] + 1; //연산 횟수를 세야하니 배열에 +1
                }
            }
        }
        System.out.println(dp[N]);
    }
}
