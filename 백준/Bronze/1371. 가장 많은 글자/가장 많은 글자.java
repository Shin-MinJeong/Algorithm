import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int alphabet[] = new int[26];

        //alphabet 배열에 a부터 z까지 매핑
        while ((input = reader.readLine()) != null) {

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                    alphabet[input.charAt(i) - 'a']++;
                }
            }
        }
         //최대 빈도수 구하기
         int max = 0;
         for (int i = 0; i < 26; i++) {
             max = Math.max(max, alphabet[i]);
         }
         for (int i = 0; i < 26; i++) {
             if (max == alphabet[i]) {
                 System.out.print((char) ('a'+ i));
             }
         }
         System.out.println();
    }
}