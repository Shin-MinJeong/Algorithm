import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //학생 수
        int k = sc.nextInt(); //구간 수
        int[] score = new int[n]; //성적배열
        double[] result = new double[k]; //결과배열

        int a = 0; //구간 시작 값
        int b = 0; //구간 끝 값

        for(int i=0 ; i<n ; i++) {
            score[i] = sc.nextInt();
        }

        //구간 수 만큼 시작/끝 값 받음
        for(int i=0 ; i<k ; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            int total = 0;
            //구간 시작부터 끝까지 순회하며 더하기
            for(int j=a-1 ; j<b ; j++) {
                total += score[j];
            }
            //평균 구하기
            double avg = (double)total / (b-(a-1)) ;
            result[i] = avg ;
        }

        //구간 수 만큼 출력
        for(int i=0 ; i<k ; i++) {
            System.out.printf("%.2f\n", result[i]);
        }
    }
}