import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //물건 개수
        int k = sc.nextInt(); //물건 최대 무게

        int[] dp = new int[k+1]; //무게 최댓값
        int[] score = new int[n+1]; //가치
        int[] weghit = new int[n+1]; //무게

        //물건 개수만큼 받기
        for(int i=1 ; i<=n ; i++) {
            weghit[i] = sc.nextInt();
            score[i]  = sc.nextInt();
        }

        for(int i=1 ; i<=n ; i++){
          /*
          뒤에서 부터 도는 이유
          이전 상태를 유지하면서 물건을 넣을지 말지 판단 */         
          for(int w=k ; w>=weghit[i] ; w--) {
              /* 물건을 넣지 않았을 때 vs 물건을 넣었을 때 가치 비교 */
              dp[w] = Math.max(dp[w], dp[w-weghit[i]]+score[i]) ;
          }
        }
        System.out.println(dp[k]);
    }
}
