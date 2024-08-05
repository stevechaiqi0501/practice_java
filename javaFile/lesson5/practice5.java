package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice5 {
    public static void main(String[] args) throws IOException 
    {
        System.out.println("成績を入力してください");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int ans = Integer.parseInt(str);
        switch (ans) {
            case 1:
                System.out.println("もっとがんばりましょう。");
                break;
            case 2:
                System.out.println("もう少し頑張りましょう");
                break;
            case 3:
                System.out.println("さらに上を目指しましょう");
                break;
            case 4:
                System.out.println("たいへんよくできました");
                break;
            case 5:
                System.out.println("たいへん優秀です");
            break;
            default:
                throw new AssertionError();
        }

    }
}