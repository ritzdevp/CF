import java.util.*;
import java.lang.*;
import java.io.*;

public class BGR11
{
    public static long func(String str, int n, int k){ 
            int ans = 0;
            int l = 0;
            int w = 0;
            int left = -1;
            int right = 0;
            boolean allLost = true;
            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++){
                if (str.charAt(i) == 'L'){
                    if (w > 0){
                        ans += 2 * (w - 1) + 1;
                    }
                    w = 0;
                    l++;
                }
                else{
                    if (left == -1){
                        left = l;
                    }
                    else if (l > 0){
                        arr.add(l);
                    }
                    l = 0;
                    allLost = false; 
                    w++;
                }
            }

            if (w > 0){
                ans += 2 * (w - 1) + 1;
            }
            if (l > 0){
                right = l;
            }

            if (allLost){
                ans = Math.min(k, n) * 2 - 1;
                if (ans == -1) ans = 0;
                return ans;
            }

            Collections.sort(arr);
            for (int i = 0; i < arr.size(); i++){
                if (k >= arr.get(i)){
                    ans += 2 * arr.get(i) + 1;
                    k -= arr.get(i);
                }
                else{
                    ans += 2 * k;
                    k -= k;
                    break;
                }
            }
            if (left == -1) left = 0;

            if (k != 0){
                if (k >= right){
                    ans += 2 * right;
                }
                else{
                    ans += 2 * k;
                }
                k -= Math.min(k, right);

                if (k >= left){
                    ans += 2 * left;
                }
                else if (k != 0){
                    ans += 2 * k;
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
