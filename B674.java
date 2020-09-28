import java.util.*;
import java.lang.*;
import java.io.*;

public class B674
{
    public static String func(int n, int m, int arr[][]){
        if (m % 2 != 0) return "NO";
        for (int i = 0; i < n; i++){
            if (arr[i][1] == arr[i][2]){
                return "YES";
            }
        }
        return "NO";
    }

	public static void main (String[] args) throws java.lang.Exception{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int m = s.nextInt();
            int arr[][] = new int[n][4];
            for (int i = 0; i < n; i++){
                arr[i][0] = s.nextInt();
                arr[i][1] = s.nextInt();
                arr[i][2] = s.nextInt();
                arr[i][3] = s.nextInt();
            }
            System.out.println(func(n, m, arr));
        }
        
	}
}
