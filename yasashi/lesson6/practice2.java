package yasashi.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice2 {
    public static void main(String[] args) throws IOException{
        System.out.println("テストの点数を入力してください(0で終了)");
        int init_score = 0;
        while(true){
            BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            int score = Integer.parseInt(str);
            
            if(score == 0){
                break;
            }
            init_score += score;
        }
        System.out.println(init_score);
    }
}
