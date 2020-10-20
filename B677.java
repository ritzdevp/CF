import java.util.*;
import java.lang.*;
import java.io.*;

public class B677
{
    public static long func(int n, int arr[]){
        long ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n - 1;){
            if (arr[i] == 1 && arr[i + 1] == 0){
                i++;
                int count = 0;
                while (i < n &&arr[i] == 0){
                    count++;
                    i++;
                }
                if (i < n && arr[i] == 1){
                    ans += count;
                }
            }
            else{
                i++;
            }
        }

        return ans;
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = s.nextInt();
            System.out.println(func(n, arr));
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
