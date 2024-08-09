package yasashi.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample11 {
    
    public static void main(String[] args) throws IOException{
        System.out.println("what number do you wanna avoid(1-10)");
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str =  br.readLine();
        int res =Integer.parseInt(str);
            
        for(int i=0; i<=10;  i++){
            if(i == res){
                continue;
            }
            System.out.println(i + "roop");

        }
    }
}