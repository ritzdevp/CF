import java.util.*;
import java.lang.*;
import java.io.*;

public class B681
{


    public static long func(int a, int b, String str){
        int ans = a;
        int len = 0;
        int start = -1, end = -1;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '1'){
                start = i;
                break;
            }
        }
        for (int i = str.length() - 1; i >= 0; i--){
            if (str.charAt(i) == '1'){
                end = i;
                break;
            }
        }
        if (start == -1) return 0;
        for (int i = start; i <= end; i++){
            if (str.charAt(i) == '1'){
                ans += Math.min(a, len * b);
                len = 0;    
            }else{
                len++;
            }
        }
        return ans;        
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            int a = s.nextInt();
            int b = s.nextInt();
            String str = s.nextLine();
            System.out.println(func(a, b, str));
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
