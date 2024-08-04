import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//レッスンのまとめ
/*1
 * 1 x
 * 2 o
 * 3 o
 */

 class practice_lesson4
 {
     public static void main(String[] args) {
         System.out.println("0-4=" + (0-4));
         System.out.println("3.14*2=" + (3.14*2));
         double cal = (double)5/(double)3;
         System.out.println("5/3=" + cal);
         System.out.println("30/7のあまりは" + (30%7));
         System.out.println("0-4=" + ((7+32)/5));
     }
 }
 
 class tri
 {
     public static void main(String[] args) throws IOException
     {
         System.out.println("三角形の高さと底辺を入力してください");
 
         BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));
 
         String d =br.readLine();
         String h =br.readLine();
 
         int D = Integer.parseInt(d);
         int H = Integer.parseInt(h);
 
         double Dnum = D;
         double Hnum = H;
 
         System.out.println("三角形の面積は" + ((Dnum*Hnum)/2));
 
     }
 }
 
 class grades
 {
     public static void main(String[] args) throws IOException
     {
         System.out.println("科目1-5の点数を入力してください");
 
         BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));
 
         String g1 =br.readLine();
         String g2 =br.readLine();
         String g3 =br.readLine();
         String g4 =br.readLine();
         String g5 =br.readLine();
 
         int G1 = Integer.parseInt(g1);
         int G2 = Integer.parseInt(g2);
         int G3 = Integer.parseInt(g3);
         int G4= Integer.parseInt(g4);
         int G5= Integer.parseInt(g5);
 
         System.out.println("５科目の合計点数は" + (G1+G2+G3+G4+G5) +"です");
         double Grade = ((double)G1+(double)G2+(double)G3+(double)G4+(double)G5)/5;
         System.out.println("５科目の平均点数は" + Grade +"です");
     }
 }        
 //追加課題
 class add_homework
 {
     public static void main(String[] args) {
         System.out.println("1.01*365=" + 1.01*365);
         System.out.println("0.99*365=" + 0.99*365);
     }
 }
 
 class add_homework2
 {
     public static void main(String[] args)throws IOException
      {
         System.out.print("商品の金額を入力してください");
 
         BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));
 
         String amount = br.readLine();
         int amount_of_money = Integer.parseInt(amount);
         double tax = (double)amount_of_money*0.08;
         int int_tax = (int)tax;
 
         System.out.println("小計" +"\t"+ amount_of_money+"円" +"\n"+
                              "外税 8%対象額"  +"\t"+ amount_of_money+"円"+"\n"+
                              "外税 8%" +"\t"+ int_tax +"円"+"\n"+
                            "合計"  +"\t"+ (amount_of_money+int_tax) + "円");
     }
 }