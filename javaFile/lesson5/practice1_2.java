package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1 a==0 && a<10
 * 2 !(a==0)
 * 3 a == 0 || a >= 10
 */
public class practice1_2 {
    public static void main(String[] args) throws IOException 
    {
        System.out.println("整数を入力してください");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int ans = Integer.parseInt(str);

        if(ans%2 == 0){
            System.out.println("奇数が入力されました");
        }
        else
        {
            System.out.println("偶数が入力されました");
        }
        switch (ans%2) {
            case 0:
            System.out.println("奇数が入力されました");
                break;
            case 1:
            System.out.println("偶数が入力されました");
            default:
                System.out.println("ou");
        }

    }
}
