import java.util.*;
import java.lang.*;
import java.io.*;

public class C675
{
    public static long mod = 1000000007;
    public static int N = 100003;

    public static long mul(long a, long b){
        long temp = ((a % mod) * (b % mod)) % mod;
        return temp;
    }

    public static long add(long a, long b){
        long c = (a % mod + b % mod) % mod;
        return c;
    }
    
    public static long func(StringBuilder sb){
         long tens[] = new long[N];
         long sumTens[] = new long[N];
         long pref[] = new long[N];
         long suff[] = new long[N];
         long prefSum[] = new long[N];
         long suffSum[] = new long[N];
         int n = sb.length();

         if (n == 1) return 0;
         if (n == 2){
             return (long)(Character.getNumericValue(sb.charAt(0)) + Character.getNumericValue(sb.charAt(1)));
         }

         tens[0] = 1; sumTens[0] = 0;
         
         for (int i = 1; i < N; i++){
             tens[i] = mul(tens[i - 1], 10);
             sumTens[i] = add(sumTens[i - 1], tens[i]);
         }

         pref[0] = Character.getNumericValue(sb.charAt(0));
         suff[n - 1] = Character.getNumericValue(sb.charAt(n - 1));
         prefSum[0] = pref[0];
         suffSum[n - 1] = suff[n - 1];
         
         for (int i = 1; i < n; i++){
             pref[i] = add(mul(pref[i - 1] , 10), Character.getNumericValue(sb.charAt(i)));
             prefSum[i] = add(prefSum[i - 1], pref[i]); 
         }

         long p = 10;
         for (int i = n - 2; i >= 0; i--){
             suff[i] = add(mul(Character.getNumericValue(sb.charAt(i)) , p), suff[i + 1]);
             suffSum[i] = add(suffSum[i + 1], suff[i]);
             p = mul(p, 10);
         }

         long ans = 0;
         ans = add(ans, suffSum[1]);
         ans = add(ans, prefSum[n - 2]);

         for (int i = 1; i < n - 1; i++){
             long temp = mul(pref[i - 1], sumTens[n - i - 1]);
             temp = add(temp, suffSum[i + 1]);
             ans = add(ans, temp);
         }

         return ans;
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(func(sb));
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
