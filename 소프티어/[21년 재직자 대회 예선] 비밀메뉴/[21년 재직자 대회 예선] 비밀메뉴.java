import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); //비밀메뉴 버튼 개수
        int n = sc.nextInt(); //사용자가 누른 버튼 개수
        int k = sc.nextInt(); //총 버튼 개수 (모든 버튼의 값은 0<x<k 이다)

        int[] scKey = new int[m];   //비밀메뉴 버튼 배열
        int[] pushKey = new int[n]; //사용자가 누른 버튼 배열
        boolean found = false;

        for(int i=0 ; i<m ; i++) {
            scKey[i] = sc.nextInt();
        }

        for(int i=0 ; i<n ; i++) {
            pushKey[i] = sc.nextInt();
        }

        //순회하며 pushKey에 scKey가 포함 되었는지 검출
        for(int i=0 ; i<= n-m ; i++) {
            found = true ;
            for(int j=0 ; j<m ; j++) {
                if(pushKey[i+j] != scKey[j]) {
                    found = false;
                    break;
                }
            }
            //found=true 면 끝냄
            if (found) break;
        }
        if(found) {
            System.out.println("secret");
        } else {
            System.out.println("normal");
        }
    }
}