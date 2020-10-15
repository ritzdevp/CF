import java.util.*;
import java.lang.*;
import java.io.*;

public class CEDU93
{
    public static long func(String str){
        int n = str.length();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++){
            arr[i] = (long)Character.getNumericValue(str.charAt(i)) - 1;;
        }
        long p[] = new long[n];
        p[0] = arr[0];
        for (int i = 1; i < n; i++){
            p[i] = p[i - 1] + arr[i];
        }

        HashMap<Long, Integer> map = new HashMap<>();
        map.put((long)0, (int)1);
        for (int i = 0; i < n; i++){
            //System.out.println(p[i]);
            if (map.containsKey(p[i])){
                map.put(p[i], map.get(p[i]) + 1);
            }
            else{
                map.put(p[i], 1);
            }
        }
        long ans = 0;
        for (Long c : map.keySet()){
            long x = map.get(c);
            long m = (x * x - x)/2;
            ans += m;
        }
        return ans;
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
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
