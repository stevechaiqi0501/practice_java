package yasashi.lesson6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class practice5 {
    public static void main(String[] args) throws IOException{
        System.out.println("２以上の整数を入力してください");
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            int score = Integer.parseInt(str);
            int i = 2;

        while(true){
            if(i == 1000){
                break;
            }

            if(score%i == 0 && score!=i){
                System.out.println(score + "は素数ではありません");
                break;
            }
            i++;
            if(i == score){
                System.out.println(score + "は素数です");
            }
        }
    }
}