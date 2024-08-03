
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*メモリについて
 * 変数は基本アドレスを持った番地に保存される
 * 型は宣言せなん
 * 変数名は基本pythonと同じルール
 */

class sample2
 {
    public static void main(String[] args) 
    {
        // int num;

        // num = 3;
        int num = 3;

        System.out.println("変数numの値は" + num + "です");
        
        num = 5;

        System.out.println("変数numの値を更新しました");
        System.out.println("変数numの値は" + num);

        int new_num = num;
        System.out.println("変数newの値が、new-numに代入されました,new_num = " + new_num + "desu");
    }
 }



class input
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("please input strings");

        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(str + "is inputeds now");
    }
}

class inputs
{    
    public static void main(String[] args) throws IOException
    {
        System.out.println("please input your message");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);
        System.out.println("strはintに型変換され" + num + "になりました");
    }
}
//キーボード入力からは、すべて文字列としてみなされるからこの処理がいる

class two_input
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("please input two iteger numbers");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str1 =br.readLine();
        String str2 =br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println("str1とstr2はそれぞれつぎのような値のintです\t" + 
                              num1 + num2 );
    
    }
}

/*練習
 * １　１・・・×
 * 　　２・・・×
 * 　　３・・・o
 */

class practice2
{
    public static void main(String[] args) 
    {
        double ch = 3.14;
        //なんでFLOARちゃうん

        ch = 3.14;

        System.out.println("変数CHの値は" + ch + "です");
    }
}

class practice3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("あなたは何歳ですか");
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String age =br.readLine();
        int age_num = Integer.parseInt(age);

        System.out.println("あなたは" + age_num + "才です");
    }
}

class practice4
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("円周率の値はいくつですか");
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String age =br.readLine();
        double value = Double.parseDouble(age);
        //parse と型で変換先を指定　例  parseDouble parseInt

        System.out.println("円周率の値は" + value + "です");
    }
}

class high_and_weight
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("身長と体重を入力して");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str1 =br.readLine();
        String str2 =br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println("身長と体重はそれぞれつぎのような値です\t" + 
                              num1 + num2 );
    
    }
}
