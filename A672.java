import java.util.*;
import java.lang.*;
import java.io.*;

public class A672
{

    public static String func(int n, int arr[]){
        int limit = (n * (n - 1)) / 2 - 1;
        int count = 0;
        for (int i = 0; i < n - 1; i++){
            if (arr[i] > arr[i + 1]) count++;
        }
        if (count == n - 1) return "NO";
        return "YES";
    }

	public static void main (String[] args) throws java.lang.Exception{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = s.nextInt();
            System.out.println(func(n, arr));
        }
	}
}
