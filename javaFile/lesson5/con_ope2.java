package lesson5;
import java.io.*;

public class con_ope2 {
    public static void main(String[] args) throws IOException
    {
        System.out.println("are you gentle?");
        System.out.println("please input Y or N?");

        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char res = str.charAt(0);
        if(res == 'Y')
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}   
