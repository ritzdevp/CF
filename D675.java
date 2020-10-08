import java.util.*;
import java.lang.*;
import java.io.*;

public class D675
{

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int n = s.nextInt();
        int m = s.nextInt();
        int sx = s.nextInt();
        int sy = s.nextInt();
        int fx = s.nextInt();
        int fy = s.nextInt();
        int arr[][] = new int[m][2];
        for (int i = 0; i < m; i++){
            arr[i][0] = s.nextInt();
            arr[i][1] = s.nextInt();
        }
        System.out.println(func(n, m, sx, sy, fx, fy, arr));
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
