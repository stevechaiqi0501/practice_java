package lesson5;
import java.io.*;

class input_if
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("整数を二つ入力してください");

        BufferedReader br = 
         new BufferedReader(new InputStreamReader(System.in));

        String num1 = br.readLine();

        int int_num1 = Integer.parseInt(num1);

        if(int_num1 == 1)
        System.out.println("1が入力されました");

        System.out.println("処理を終えます");
        
    }
}
