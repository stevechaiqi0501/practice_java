package fix;

class lesson2_feedback
{
  public static void main(String[] args) 
  {
    System.out.println("全事象について主体的に考え行動する\n" +  
                       "\n" +
                       "全関係者のことを考えて行動する\n" +  
                       "\n" +
                       "全体合理性に基づき行動する\n" + 
                       "\n" +
                       "全力で取り組む・全力で楽しむ\n" +
                       "\n" +
                       "「ZENや自分と付き合えてよかった」と感じてもらう");
  }
}

class lesson3_feedback
{
      public static void main(String[] args) {
        double effort = Math.pow(1.01,365);
        double  not_effort = Math.pow(0.99,365);
        //format関数をよびだして、桁数を指定するのは,pythonと違いあんまりない。
          System.out.println("1.01**365=" + String.format("%.1f",effort));
          System.out.println("0.99**365=" + String.format("%.1f",not_effort));
      }
}
  
