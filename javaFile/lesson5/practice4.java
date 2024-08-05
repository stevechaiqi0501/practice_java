package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice4 {
    public static void main(String[] args) throws IOException 
    {
        System.out.println("1から10の整数を入力してください");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int ans = Integer.parseInt(str);
        
        if (0<=ans && ans<=10) {
            System.out.println("corrct!");
        }
        else
        {System.out.println("that's incorrect ");}

}
}