import java.util.*;
import java.lang.*;
import java.io.*;

public class C673
{

    public static void func(int n, int arr[]){
        StringBuffer finalans = new StringBuffer();

        int ans[] = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            ans[i] = -1;
        }
        int gap[]=new int[n + 1];
        int last[]=new int[n + 1];
        
        for(int i = 1; i <= n; i++) {
            int pos = arr[i-1];
            gap[pos] = Math.max(gap[pos], i - last[pos]);
            last[pos] = i;
        }
        for(int i= 1; i <= n; i++) {
            gap[i] = Math.max(gap[i], n - last[i] + 1);
            
            for(int j = gap[i]; j <= n && ans[j] == -1; j++) {
                ans[j] = i;
            }
        }

        for (int i = 1; i <= n; i++){
            finalans.append(ans[i] + " ");
        }
        String printans = finalans.toString();
        System.out.print(printans);
    }

	public static void main (String[] args) throws java.lang.Exception{
        FastReader s = new FastReader();
        //Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = s.nextInt();
            func(n, arr);
            System.out.println();
        }
    }
    
    static class FastReader 
    { 
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
