package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class addhomework2 
{
     public static void main(String[] args) throws IOException
    {
        
        System.out.println("猫の年齢を入力してください");
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String age = br.readLine();
        double dou_age = Double.parseDouble(age);

        if(dou_age<=1)
        {
            System.out.println("人間でいう"+ String.format("%.1f",(dou_age*20)) +"歳です");
        }

        else if(1<dou_age && dou_age<=5)
        {
            System.out.println("人間でいう"+ String.format("%.1f",(20+dou_age*6+15)) +"歳です");
        }
        else if(5<dou_age && dou_age<=10)
        {
            System.out.println("人間でいう"+ String.format("%.1f",(dou_age*4+30)) +"歳です");
        }
        else if(5<dou_age && dou_age<=10)
        {
            System.out.println("人間でいう"+ String.format("%.1f",(dou_age*3+45)) +"歳です");
        }
    }
}
