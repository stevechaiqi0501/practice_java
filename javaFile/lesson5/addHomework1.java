package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class addHomework1 {
    public static void main(String[] args) throws IOException
    {
        //身長は普通cmで答えることが多いのでcmで答える前提とします
        System.out.println("身長を入力してください");
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String height = br.readLine();
        double dou_height = Double.parseDouble(height);

        System.out.println("体重を入力してください");

        String weight = br.readLine();
        double dou_weight = Double.parseDouble(weight);
        double height_square = (dou_height/100)*(dou_height/100);

        System.out.println("肥満度:" + String.format("%.1f",(dou_weight/height_square)));
        System.out.println("適正体重:" + String.format("%.1f",height_square*22));

        if(dou_weight>height_square*22)
        {
            System.out.println("適正体重と比較:あなたの体重は適正体重と比べて" +
              String.format("%.1f",(dou_weight-height_square*22)) +"kg重いです");   
        }

        else if (dou_weight<height_square*22)
        {
            System.out.println("適正体重と比較:あなたの体重は適正体重と比べて" + 
            String.format("%.1f",(height_square*22-dou_weight)) +"kg軽いです");
        }
        else
        {
            System.out.println("適正体重と比較:あなたの体重は適正体重です");
        }
        System.out.println("BMI:" + String.format("%.1f",dou_weight/height_square));
        
    }
}
