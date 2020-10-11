import java.util.*;
import java.lang.*;
import java.io.*;

public class AGR11
{
    public static void func(int arr[]){
        int n = arr.length;
        int b[] = new int[n];
        Arrays.sort(arr);
        int j = n - 1;
        for (int i = 0; i < n; i++){
            b[j] = arr[i];
            j--;
        }

        int sum1 = 0;
        boolean flag = true;
        for (int i = 0; i < n; i++){
            sum1 += arr[i];
            if (sum1 == 0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("YES");
            for (int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        int sum2 = 0;
        boolean flag2 = true;
        for (int i = 0; i < n; i++){
            sum2 += b[i];
            if (sum2 == 0){
                flag2 = false;
                break;
            }
        }
        if (flag2){
            System.out.println("YES");
            for (int i = 0; i < n; i++){
                System.out.print(b[i] + " ");
            }
            System.out.println();
            return;
        }
        System.out.println("NO");
        return;
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = s.nextInt();
            func(arr);
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
