import java.util.*;
import java.lang.*;
import java.io.*;

public class A680
{

	public static void main (String[] args) throws java.lang.Exception{
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            String nums = s.nextLine();
            String numsA[] = nums.split(" ");
            int n = Integer.parseInt(numsA[0]);
            int x = Integer.parseInt(numsA[1]);
            int arr[] = new int[n];
            int brr[] = new int[n];
            String a = s.nextLine();
            String temp[] = a.split(" ");
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(temp[i]);
            String b = s.nextLine();
            String temp2[] = b.split(" ");
            for (int i = 0; i < n; i++) brr[i] = Integer.parseInt(temp2[i]);
            if (t != 0){
                String empty = s.nextLine();
            }
            Arrays.sort(arr);
            Arrays.sort(brr);
            int j = n - 1;
            for (int i = 0; i < n; i++){
                if (arr[i] + brr[j] > x){
                    System.out.println("No");
                    break;
                }
                j--;
            }
            if (j == -1){
                System.out.println("Yes");
            }
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
