package yasashi.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.classfile.Signature;

public class addHomework2 {
    public static void main(String[] args) throws IOException{
        System.out.println("「夢実現企業」でおなじみのIT企業と言えば？");
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        while(true){
        String input_com = br.readLine();

        if(input_com.equals("ZEN Integration")){
            System.out.println("正解です");
            break;
        }else{
            System.out.println("違います");
        }
    
        }
    }
}
