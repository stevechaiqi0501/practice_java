package yasashi.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample4 {
    public static void main(String[] args) throws IOException{
        System.out.println("HOW much DO U WANNA add * ?");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        int sum = 0;

        for(int i=1; i<=num; i++){
             sum += i;
        }
        System.out.println(sum);
    }
}

