import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];

        for(int i=0 ; i<8 ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] asc = arr.clone();
        Arrays.sort(asc); //기본 메소드 asc 정렬

        int[] desc = arr.clone();
        Arrays.sort(desc); //asc 정렬 후
        reverse(desc);     //desc 정렬

        if (Arrays.equals(arr, asc)) {
            System.out.println("ascending");
        } else if (Arrays.equals(arr, desc)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }

    //desc 정렬
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}