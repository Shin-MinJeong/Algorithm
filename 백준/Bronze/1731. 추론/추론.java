import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //첫번째 줄에는 수열의 길이
        //그 다음 줄에는 각 원소가 주어진다.
        int N = Integer.parseInt(reader.readLine());

        // 수열의 각 원소 입력
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        if (arr[2] - arr[1] == arr[1] - arr[0])
            System.out.println(arr[arr.length - 1] + (arr[1] - arr[0]));
		else
            System.out.println(arr[arr.length - 1] * (arr[1] / arr[0]));
    }
}