package yasashi.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample9 {
    public static void main(String[] args) throws IOException{
        System.out.println("how much make you stop calling?");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        for(int i=1;i<=10;i++){
            System.out.println(i + "ROOP");
            if(i == res){
                break;
            }
        }


    }
}