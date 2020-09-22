import java.util.*;
import java.lang.*;
import java.io.*;

public class cf
{
    public static void func(int n){
        if (n < 31){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        if (n == 36 || n == 40 || n == 44){
            System.out.println("6 10 15 " + (n - 31));
            return;
        }
        
        System.out.println("6 10 14 " + (n - 30));
    }

	public static void main (String[] args) throws java.lang.Exception{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            func(n);
        }
	}
}
