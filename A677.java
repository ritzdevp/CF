import java.util.*;
import java.lang.*;
import java.io.*;

public class A677
{
    public static long func(String str){
        int n = Character.getNumericValue(str.charAt(0));
        long ans = 0;
        ans += 10 * (n - 1);
        if (str.length() == 1){
            ans++;
        }
        else if (str.length() == 2){
            ans += 3;
        }
        else if (str.length() == 3){
            ans += 6;
        }
        else if (str.length() == 4){
            ans += 10;
        }
        return ans;
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            String str = s.nextLine();
            System.out.println(func(str));
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
