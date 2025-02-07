import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //수열의 크기
        int[] arr = new int[n] ; //수열
        int[] list = new int[n] ; //정렬할 배열
        int length = 0 ; //정렬 배열 길이

        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0 ; i<n ; i++) {
            //이분탐색 (가장 길게 증가하는 수열 찾는다)
            int pos = Arrays.binarySearch(list,0,length,arr[i]) ;
            //음수일 경우 처리
            if(pos<0) pos = -(pos+1) ;

            list[pos] = arr[i] ; //정렬 배열
            if(pos==length) length++ ; //배열 길이++
        }
        System.out.println(length);

    }
}
