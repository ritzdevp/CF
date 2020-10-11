import java.util.*;
import java.lang.*;
import java.io.*;

public class AEDU96
{
    public static void func(int n){

    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        int dp[][] = new int[1001][4];
        dp[0][0] = 1; //0 sum is possible as combo is 0,0,0
        dp[1][0] = -1;
        dp[2][0] = -1;

        int cost[] = {3, 5, 7};
        for (int i = 3; i < dp.length; i++){
            boolean flag = false;
            for (int j = 0; j < 3; j++){
                if (i >= cost[j] && dp[i - cost[j]][0] == 1){
                    flag = true;
                    int x = cost[j];
                    dp[i][0] = 1;
                    dp[i][1] = dp[i - cost[j]][1];
                    dp[i][2] = dp[i - cost[j]][2];
                    dp[i][3] = dp[i - cost[j]][3];

                    if (x == 3){
                        dp[i][1]++;
                    }
                    else if (x == 5){
                        dp[i][2]++;
                    }
                    else{
                        dp[i][3]++;
                    }
                    break;
                }
            }
            if (!flag){
                dp[i][0] = -1;
            }
        }

        while (t-- != 0){
            int n = s.nextInt();
            if (dp[n][0] == -1){
                System.out.println(-1);
            }
            else{
                System.out.println(dp[n][1] + " " + dp[n][2] + " " + dp[n][3]);
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
