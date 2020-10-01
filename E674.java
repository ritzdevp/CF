import java.util.*;
import java.lang.*;
import java.io.*;

public class E674
{
    public static void func(int n, int a[], int b[]){
        //R 0, S 1, P 2
        int max = Math.min(a[0], b[1]) + Math.min(a[1], b[2]) + Math.min(a[2], b[0]);
        int min = Math.max(0, a[0] - (b[0] + b[2])) + Math.max(0, a[1] - (b[1] + b[0])) + Math.max(0, a[2] - (b[2] + b[1]));
        System.out.println(min + " " + max);
    }

	public static void main (String[] args) throws java.lang.Exception{
        Scanner s = new Scanner(System.in);
        //FastReader s = new FastReader();
        int n = s.nextInt();
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) arr[i] = s.nextInt();
        int brr[] = new int[3];
        for (int i = 0; i < 3; i++) brr[i] = s.nextInt();
        func(n, arr, brr);
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
