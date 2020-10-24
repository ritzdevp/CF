import java.util.*;
import java.lang.*;
import java.io.*;

public class B678
{
    public static void printMatrix(int arr[][]){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static void func(int n, boolean prime[], int help[]){
        int arr[][] = new int[n][n];
        if (n == 2){
            Arrays.fill(arr[0], 1);
            Arrays.fill(arr[1], 1);
            printMatrix(arr);
            return;
        }

        if (prime[n]){
            for (int i = 0; i < n; i++){
                Arrays.fill(arr[i], 1);
            }
            printMatrix(arr);
            return;
        }

        // int x = help[n];
        
        // int start = 0, end = n - 1;
        // int count = 0;
        // for (int i = 0; i < x; i++){
        //     arr[i][start] = 1;
        //     arr[i][end] = 1;
        // }
        // int p = n - x;
        // start++;
        // end--;
        // for (int i = x; i < p + x; i++){
        //     arr[i][start] = 1;
        //     arr[i][end] = 1;
        // }
        
        // int current = help[n];
        // System.out.println("current");
        // while (count != n){
        //     for (int i = count; i < count + current; i++){
        //         System.out.println(i + " " + current);
        //         arr[i][start] = 1;
        //         arr[i][end] = 1;
        //         count++;
        //     }
        //     start++;
        //     end--;
        //     current = help[current];
            
        // }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = 100;
            }
        }
        //System.out.println("n = " + n);
        int sum = n * 100;
        int x = help[sum];
        int p = sum - x;
        sum = sum - p;
        while ((prime[100 - p] || !prime[sum])){
            p++;
            sum--;
        }
        
        
        for (int i = 0; i < n; i++){
            arr[i][i] = 100 - p;
        }

        printMatrix(arr);
        return;
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        int N = 100000;
        boolean prime[] = new boolean[N + 1]; 
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
          
        for(int p = 2; p*p <=N; p++) 
        { 
            if(prime[p] == true) 
            { 
                for(int i = p*p; i <= N; i += p) 
                    prime[i] = false; 
            } 
        }

        int help[] = new int[N + 1];
        int current = 2;
        for (int i = 2; i < help.length; i++){
            if (prime[i]){
                current = i;
                help[i] = i;
            }
            else{
                help[i] = current;
            }
        }
        // for (int i = 0; i < 100; i++){
        //     System.out.println(i + " " + help[i]);
        // }
        

        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            func(n, prime, help);
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
