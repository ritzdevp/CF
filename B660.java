import java.util.*;
import java.lang.*;
import java.io.*;

public class B660
{
    public static String func(int n){
        StringBuilder ans = new StringBuilder(); 
        int count8 = 0;
        if (n % 4 == 0){
            count8 = n / 4;
        }
        else{
            count8 = n/4 + 1;
        }
        int count9 = n - count8;
        for (int i = 0; i < count9; i++) ans.append("9");
        for (int i = 0; i < count8; i++) ans.append("8");

        return ans.toString();
    }

	public static void main (String[] args) throws java.lang.Exception{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            System.out.println(func(n));
        }
	}
}
