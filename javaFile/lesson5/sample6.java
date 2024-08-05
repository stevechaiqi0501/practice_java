package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample6 {
    public static void main(String[] args) throws IOException
        {
            System.out.println("aかbを入力してください");
    
            BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
    
            String str = br.readLine();
            char res = str.charAt(0);

            switch (res) {
                case 'a':
                    System.out.println("a is inputted");
                    break;//break make block finish
                case 'b':
                    System.out.println("b is inputted");
                    break;
        
                default:
                    System.out.println("please input a or b");
                    break;
            }
        }
}
