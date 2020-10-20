import java.util.*;
import java.lang.*;
import java.io.*;

public class C677
{
    public static void func(int arr[]){
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++){
            max = Math.max(arr[i], max);
        }
        int ans = -1;
        for (int i = 0; i < n; i++){
            if (arr[i] == max){
                if (i - 1 >= 0 && arr[i - 1] < arr[i]){
                    ans = i + 1;
                    break;
                }
                else if (i + 1 < n && arr[i + 1] < arr[i]){
                    ans = i + 1;
                    break;
                }
            }
        }
        System.out.println(ans);
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = s.nextInt();
            func(arr);
        }

	}

////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////-----------FAST READER------------/////////////////////////
    static class FastReader { 
            BufferedReader br; 
            StringTokenizer st; 
    
            public FastReader() 
            { 
                br = new BufferedReader(new
                        InputStreamReader(System.in)); 
            } 
    
            String next() 
            { 
                while (st == null || !st.hasMoreElements()) 
                { 
                    try
                    { 
                        st = new StringTokenizer(br.readLine()); 
                    } 
                    catch (IOException  e) 
                    { 
                        e.printStackTrace(); 
                    } 
                } 
                return st.nextToken(); 
            } 
    
            int nextInt() 
            { 
                return Integer.parseInt(next()); 
            } 
    
            long nextLong() 
            { 
                return Long.parseLong(next()); 
            } 
    
            double nextDouble() 
            { 
                return Double.parseDouble(next()); 
            } 
    
            String nextLine() 
            { 
                String str = ""; 
                try
                { 
                    str = br.readLine(); 
                } 
                catch (IOException e) 
                { 
                    e.printStackTrace(); 
                } 
                return str; 
            } 
    }

}
