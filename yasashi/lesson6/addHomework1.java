package yasashi.lesson6;

public class addHomework1 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
                if(1+i == j||5-i == j){
                    System.out.print("X");
                }else{
                    System.err.print("*");
                }
            }System.out.println("");
        }
    }
    
}
