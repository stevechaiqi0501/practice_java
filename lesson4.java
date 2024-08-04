import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class simple
{
    public static void main(String[] args) {
        
        System.out.println("1+2は"  + (1+2) +"です");
        
    }
}

class cal
{
    public static void main(String[] args) {
        
        int num1 = 2;
        int num2 = 3;

        int sum =num1+num2;

        System.out.println("num1+num2は"  + sum +"です");
    }
}

class input_cal
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

        System.out.println("num1 + num2 =" + (int_num1+int_num2));
        
    }
}

class cals
{
    public static void main(String[] args) {
        
        int num1 = 2;
        int num2 = 3;

        int sum =num1+num2;

        System.out.println("num1+num2は"  + sum +"です");
    }
}

class input_cal2
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

        System.out.println("num1 X num2 =" + (int_num1*int_num2));
        System.out.println("num1 / num2 =" + (int_num1/int_num2));
        System.out.println("num1 / num2のあまりは" + (int_num1*int_num2));
    }
}

// a++; a = a+1 

/*後置インクリメントについて
 * 
 * 後置インクリメントの場合は、”代入してから”　１を足す
*/
class inclement1
{
    public static void main(String[] args) {
        int a=0;
        int b=0;

        b = a++;//この時点ではまだAは０なので、Ｂには０が代入
        //この時初めて１になる
        System.out.println("まだbには0のまま代入されたので、" + b + "のままです");

    }
}
/*前置インクリメントでは、*代入してから*、値に１をたす */
class inclement2
{
    public static void main(String[] args) {
        int a=0;
        int b=0;

        b = ++a;//この時点でもう1なので、Ｂには1が代入
        System.out.println("もうbには1が代入されたので、" + b + "です");

    }
}

class cal3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("整数を二つ入力してください");

        BufferedReader br = 
         new BufferedReader(new InputStreamReader(System.in));

        String num1 = br.readLine();
        String num2 = br.readLine();
        String num3 = br.readLine();

        int num = 0;

        num += Integer.parseInt(num1);//Integer.parseInt(num1)は、strから変換されたintを表すに過ぎない
        num += Integer.parseInt(num2);
        num += Integer.parseInt(num3);

        System.out.println("入力された値の合計値は" + num + "です");
    }
}
 
/*シフト演算
 * (算術シフトとか論理シフトのことですか？？？？)
 * 
 * 5<<2では、2を基数にして左に論理シフト
 * 負の値を扱うときのみ、算術シフトをするというcsのルールにのっとっているのでしょうか・・・？
 */

 /*演算のルール
 　順番は算数の四則演算と基本的に変わらない
  ただ、プログラミング特有の代入演算子の場合、右結合からというルールがある
  例えば a=b=1という演算があったとき、算数では等式関係がなりたつが、プログラミングでは
  代入関係がなりたつため、右から代入される
  */

  //型変換のルールはpythonと少し違う
  /*型の:大きさ:に注目する
   * 
   */

class input_cald//これは大は小を兼ねるだから大丈夫
{
    public static void main(String[] args) {
        int int_num = 160;

        System.out.println("身長は" + int_num +"です");
        System.out.println("double型に変換されます");
        double dnum = int_num;

    }
}

class input_caldS
//これは大から小だから、箱がはいらん
{
    public static void main(String[] args) {
        double dnum = 160.5;

        System.out.println("身長は" + dnum +"です");
        System.out.println("int型に変換されます");
        //int inum = dnum;だといかん、特別な記述が必要正しくは
        int inum = (int)dnum;
        System.out.println("身長は" + inum +"です");


    }
}

/*違う型同士の演算の際は、大きい型に合わせられるのがルール 
 * しかし、演算結果に、左辺にない型が現れた場合は、特殊な記述が必要
*/

class calll
{
    public static void main(String[] args) {
        int int_num = 4;
        int int_num2 = 5;

        System.out.println("4/5の値は" + (int_num/int_num2) +"です");
        //"4/5は０です　となる、これは演算結果の型が対応してないから　そのため"
        double div = (double)int_num/(double)int_num2;
        //のワンクッションおかないといけない
        System.out.println("4/5の値は" + div +"です");
    }
}
