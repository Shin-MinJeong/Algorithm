import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine()); //나무에 앉아 있는 새의 수
        int K = 0 ; //몇 초
        int bird = 1; //날아 가는 새의 수

        while(N >= 1) { //앉아 있는 새의 수가 1마리 이상일 때 반복
            if(N<bird) { 
                bird = 1 ;
            }else {
                N -= bird ;
                bird++;
                K++ ;
            }
        }
        System.out.println(K);
    }
}