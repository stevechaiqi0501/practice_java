package lesson5;
import java.io.*;
public class input_esle_if 
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("整数を二つ入力してください");

        BufferedReader br = 
         new BufferedReader(new InputStreamReader(System.in));

        String num1 = br.readLine();
        String num2 = br.readLine();

        int int_num1 = Integer.parseInt(num1);
        int int_num2 = Integer.parseInt(num2);

        if(int_num1+int_num2 == 5){
            System.out.println("int_num1には、"+ int_num1 +"が入力されました");
            System.out.println("int_num2には、"+ int_num2 +"が入力されました");
            System.out.println("その和は５です");//条件の範囲は囲む
        }
        // == False　のときにもう一階層下げてIFをしたいときの記述方法
        else if(int_num1+int_num2 == 4){
            System.out.println("num1 + num2 = 4 desu" );
        }

        System.out.println("num1 + num2 =" + (int_num1+int_num2));
        
    }
}