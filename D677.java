import java.util.*;
import java.lang.*;
import java.io.*;

public class D677
{
    public static void func(int n, int arr[]){
        int i = 0;
        for (i = 1; i < n; i++){
            if (arr[i] != arr[i - 1]){
                break;
            }
        }
        if (i == n){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        int j = 0;
        for (i = 1; i < n; i++){
            if (arr[i] == arr[0]) continue;
            else {
                System.out.println(1 + " " + (i + 1));
                j = i;
            }
        }
        for (i = 1; i < n; i++){
            if (arr[i] == arr[0]){
                System.out.println((i + 1) + " " + (j + 1));
            }
        }
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = s.nextInt();
            func(n, arr);
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
