package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice3 {
    public static void main(String[] args) throws IOException
    {
            System.out.println("２つの整数を入力してください");

            BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

            String str1 =br.readLine();
            String str2 =br.readLine();

            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);

            if(num1>num2){
                System.out.println(num1+ "は" + num2 + "より大きいです");
            }
            else if(num1==num2){
                System.out.println("２つは同じ値です");
            }
            else
            {System.out.println(num2+ "は" + num1 + "より大きいです");
        }
    }
        
}


