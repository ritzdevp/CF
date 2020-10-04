import java.util.*;
import java.lang.*;
import java.io.*;

public class B675
{

    public static long helper(long arr[], int n)  {  
        long c = 0;  
        Arrays.sort(arr);  
        long mid = arr[n / 2];  
        for (int i = 0; i < n; i++)  
            c += Math.abs(arr[i] - mid);  
    
        if (n % 2 == 0) {  
            long temp = 0;  
            mid = arr[(n / 2) - 1];  
            for (int i = 0; i < n; i++)  
                temp += Math.abs(arr[i] - mid);  
    
            c = Math.min(c, temp);  
        }  
    
        return c;  
    }  

    public static long max(long a, long b, long c, long d){
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }
    public static long min(long a, long b, long c, long d){
        return Math.min(a, Math.min(b, Math.min(c, d)));
    }

    public static long func(long arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int topRow = 0;
        int bottomRow = n - 1;
        int leftCol = 0;
        int rightCol = m - 1;
        long count = 0;
        while (topRow <= bottomRow){
            long topleft = arr[topRow][leftCol];
            long topright = arr[topRow][rightCol];
            long bottomleft = arr[bottomRow][leftCol];
            long bottomright = arr[bottomRow][rightCol];
            long max = max(topleft, topright, bottomleft, bottomright);
            long min = min(topleft, topright, bottomleft, bottomright);
            long temp = (max + min)/2;
            long temp2 = (max + min)/2 + 1;
            long temp3 = max;
            long temp4 = min;

            long brr[] = {topleft, topright, bottomleft, bottomright};
            //count += helper(brr, 4);

            if (topRow == bottomRow && leftCol != rightCol){
                long brr1[] = {topleft, topright};
                count += helper(brr1, 2);
            }
            else if (topRow != bottomRow && leftCol == rightCol){
                long brr2[] = {topleft, bottomleft};
                count += helper(brr2, 2);
            }
            else{
                count += helper(brr, 4);
            }

            // int count1 = 0;
            // int count2 = 0;
            // int count3 = 0;
            // int count4 = 0;

            // if (topRow == bottomRow && leftCol != rightCol){
            //     count1 += Math.abs(topleft - temp) + Math.abs(topright - temp);
            // }
            // else if (topRow != bottomRow && leftCol == rightCol){
            //     count1 += Math.abs(topleft - temp) + Math.abs(bottomleft - temp);
            // }
            // else{
            //     count1 += Math.abs(topleft - temp) + Math.abs(topright - temp) + Math.abs(bottomleft - temp) + Math.abs(bottomright - temp);
            // }

            // if (topRow == bottomRow && leftCol != rightCol){
            //     count2 += Math.abs(topleft - temp2) + Math.abs(topright - temp2);
            // }
            // else if (topRow != bottomRow && leftCol == rightCol){
            //     count2 += Math.abs(topleft - temp2) + Math.abs(bottomleft - temp2);
            // }
            // else{
            //     count2 += Math.abs(topleft - temp2) + Math.abs(topright - temp2) + Math.abs(bottomleft - temp2) + Math.abs(bottomright - temp2);
            // }

            // if (topRow == bottomRow && leftCol != rightCol){
            //     count3 += Math.abs(topleft - temp3) + Math.abs(topright - temp3);
            // }
            // else if (topRow != bottomRow && leftCol == rightCol){
            //     count3 += Math.abs(topleft - temp3) + Math.abs(bottomleft - temp3);
            // }
            // else{
            //     count3 += Math.abs(topleft - temp3) + Math.abs(topright - temp3) + Math.abs(bottomleft - temp3) + Math.abs(bottomright - temp3);
            // }

            // if (topRow == bottomRow && leftCol != rightCol){
            //     count4 += Math.abs(topleft - temp4) + Math.abs(topright - temp4);
            // }
            // else if (topRow != bottomRow && leftCol == rightCol){
            //     count4 += Math.abs(topleft - temp4) + Math.abs(bottomleft - temp4);
            // }
            // else{
            //     count4 += Math.abs(topleft - temp4) + Math.abs(topright - temp4) + Math.abs(bottomleft - temp4) + Math.abs(bottomright - temp4);
            // }


            // count += min(count1, count2, count3, count4);

            leftCol++;
            rightCol--;
            if (leftCol > rightCol){
                leftCol = 0;
                rightCol = m - 1;
                topRow++;
                bottomRow--;
            }
        }
        return count;
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int m = s.nextInt();
            long arr[][] = new long[n][m];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    arr[i][j] = s.nextLong();
                }
            }
            System.out.println(func(arr));
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
