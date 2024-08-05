package lesson5;
import java.io.*;

public class input_switch {
    
        public static void main(String[] args) throws IOException
        {
            System.out.println("整数を入力してください");
    
            BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
    
            String str = br.readLine();
            int res = Integer.parseInt(str);
    
            /*switchは,else ifを簡略化して書くことができる
             * defaultでは、いずれのcaseにも当てはまらない場合を記述する
            */
            switch (res) {
                case 1:
                    System.out.println("1 is inputted");
                    break;//break make block finish
                case 2:
                    System.out.println("2 is inputted");
                    break;
        
                default:
                    System.out.println("please input 1 or 2");
                    break;
            }
        }
    }
    
