import java.util.*;
import java.lang.*;
import java.io.*;

public class CEDU96
{
    public static void func(int n){
        if (n == 2){
            System.out.println(2);
            System.out.println(1 + " " + 2);
            return;
        }
        int arr[] = new int[n + 1];
        for (int i = 0; i < arr.length; i++) arr[i] = i;
        int j = n;
        boolean first = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n - 1; i++){
            sb.append(arr[j-1] + " " + arr[j] + "\n");
            arr[j - 1] = (int)Math.round(((double)arr[j] + (double)arr[j - 1])/(double)2);
            j--; 
        }
        StringBuilder ans = new StringBuilder();
        ans.append(arr[1] + "\n");
        ans.append(sb);
        System.out.println(ans);
        return;
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            func(n);
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
