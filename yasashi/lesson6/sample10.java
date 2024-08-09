package yasashi.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class sample10 {
    public static void main(String[] args) throws IOException{
        System.out.println("how much make you stop calling?");

        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch (res) {
            case 1:
            case 2:
                System.out.println("please make a effort");
                break;
            case 3:
            case 4:
                System.out.println("PLEASE CONTINUE YOUR GRADE");
            case 5:
                System.out.println("very good");
            default:
                System.out.println("please input between 1 and 5");
        }
    }
}