import java.util.*;
import java.lang.*;
import java.io.*;

public class A674
{
    public static int func(int n, int x){
        if (n <= 2) return 1;
        int k = n - 3;
        int p = k / x;
        return p + 2; 
    }

	public static void main (String[] args) throws java.lang.Exception{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int x = s.nextInt();
            System.out.println(func(n, x));
        }
	}
}
