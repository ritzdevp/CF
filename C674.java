import java.util.*;
import java.lang.*;
import java.io.*;

public class C674
{
    public static int func(int n){
        int ans = n;
        for (int i = 1; i * i <= n; i++){
            ans = Math.min(ans, i - 1 + ((n - i) + i - 1)/i);
        }
        return ans;
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
