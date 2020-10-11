import java.util.*;
import java.lang.*;
import java.io.*;

public class BGR11
{
    public static long func(String str, int n, int k)
        { 
            if (k == 0){
                long ans = 0;
                for (int i = 0; i < n; i++){
                    if (str.charAt(i) == 'W'){
                        if (i - 1 >= 0 && str.charAt(i - 1) == 'W'){
                            ans += 2;
                        }
                        else{
                            ans += 1;
                        }
                    }
                }
                return ans;
            }
     
            int max = 0; 
            int p = 0; 
            int left = 0;
            int right = 0; 
            
            int ansL = 0, ansR = 0;
            while (right < n) { 
            
                if (str.charAt(right) != 'W') p++; 
        
                while (p > k) { 
                    if (str.charAt(left) != 'W') p--; 
                    
                    left++; 
                } 
                if (right - left + 1 > max){
                    ansL = left;
                    ansR = right;
                    
                    max = right - left + 1;
                }
                right++; 
            } 
            long sum = 0;
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == 'W'){
                    if (i >= ansL && i <= ansR){
                        continue;
                    }
                    else{
                        if (i - 1 >= 0){
                            if (str.charAt(i - 1) == 'W' || (i - 1 == ansR)){
                                sum += 2;
                            }
                            else{
                                sum += 1;
                            }
                        }
                        else{
                            sum += 1;
                        }
                    }
                }   
            }
            
            // if (ansL - 1 >= 0 && str.charAt(ansL - 1) == 'W'){
            //     sum  += (2 * max);
            // }
            // else{
                sum += 1 + (2 * (max - 1));
            // }
            
            return sum;
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int k = s.nextInt();
            String str = s.nextLine();
            System.out.println(func(str, n, k));
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
