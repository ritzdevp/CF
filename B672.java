import java.util.*;
import java.lang.*;
import java.io.*;

public class B672
{
    public static int helper(int n){
        int p = (int)(Math.log(n)/Math.log(2));
        return (int)Math.pow(2, p);
    }

    
    public static long func(int n, int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            int q = helper(arr[i]);
            if (map.containsKey(q)){
                map.put(q, map.get(q) + 1);
            }else{
                map.put(q, 1);
            }
        }
        long count = 0;
        for (Integer c : map.keySet()){
            long x = (long)map.get(c);
            count += (x*x - x)/2;
        }
        return count;
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
