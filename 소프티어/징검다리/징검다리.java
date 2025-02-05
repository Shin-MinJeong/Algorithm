import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   //돌의 개수
        int[] arr = new int[n]; //돌의 높이 배열, 낮은곳에서 높은곳으로 뛰어 넘을 수도 있음. 그래서 단순 count++ 방법은 불가

        for (int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        //이분 탐색 배열
        int[] list = new int[n];
        int len = 0;

        for (int i=0 ; i<n ; i++) {
            //현재 돌의 높이를 list 배열 내에 삽입할 위치를 이분 탐색으로 찾는다.
            int pos = Arrays.binarySearch(list, 0, len, arr[i]);

            if (pos < 0) { //음수라면?
                pos = -(pos + 1);
            }

            list[pos] = arr[i];  //해당 위치에 현재 값을 삽입

            //만약 list의 끝에 새 값을 추가한 경우라면 길이를 늘린다.
            if (pos == len) {
                len++;
            }
        }

        System.out.println(len); //배열 길이를 출력
    }
}