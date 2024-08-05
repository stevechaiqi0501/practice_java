package lesson5;
import java.io.*;

public class con_ope {
    public static void main(String[] args) throws IOException
    {
        System.out.println("are you gentle?");
        System.out.println("please input Y or N?");

        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char res = str.charAt(0);

        if(res == 'Y' || res == 'y'){
            System.out.println("yes you are gentle right?");
        }
        else if(res == 'N' || res == 'n'){
            System.out.println("yes you are redies right?");


        
        }

    }
}
/*
 * || is or
 * && is and
 * !(a == 1) mean except a ==1
 */