import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //단계
        int result = 1 ;      //결과

        for(int i=0 ; i<n ; i++) {
            result = result *= 2 ;
        }

        System.out.println((result+1)*(result+1));
    }
}