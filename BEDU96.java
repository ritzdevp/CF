import java.util.*;
import java.lang.*;
import java.io.*;

public class BEDU96
{
    public static void func(long arr[], int K){
        Arrays.sort(arr);
        long min = arr[0];
        int n = arr.length;
        if (n == 1){
            System.out.println(0);
            return;
        }
        int j = n - 2;
        int k = K;
        if (k >= 1) min = 0;
        while (k != 0){
            arr[n - 1] += arr[j];
            j--;
            k--;
        }

        if (K >= 1){
            System.out.println(arr[n - 1] - min);
        }
        else{
            System.out.println(arr[n - 1] - arr[0]);
        }
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int k = s.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) arr[i] = s.nextLong();
            func(arr, k);
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
