import java.util.*;
import java.lang.*;
import java.io.*;

public class A673
{

	public static void main (String[] args) throws java.lang.Exception{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int k = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = s.nextInt();
            Arrays.sort(arr);
            int count = 0;
            for (int i = n - 1; i >= 1; i--){
                int x = (k - arr[i])/arr[0];
                if (x > 0){
                    count += x;
                }
            }
            System.out.println(count);
        }
	}
}
