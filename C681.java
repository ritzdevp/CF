import java.util.*;
import java.lang.*;
import java.io.*;

public class C681
{
    static class Pair{
        public long x;
        public long y;
        public Pair(long x, long y){
            this.x = x;
            this.y = y;
        }
    }

    public static long func(int n, long one[], long two[]){
        ArrayList<Pair> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            arr.add(new Pair(one[i], two[i]));
        }
        Collections.sort(arr, new Comparator<Pair>(){
            @Override
            public int compare(Pair p1, Pair p2){
                return (int)(p1.x - p2.x);
            }
        });
        long time = 0;
        for (int i = n - 1; i >= 0; i--){
            if (time + arr.get(i).y < arr.get(i).x){
                time += arr.get(i).y;
            }
            else{
                time = Math.max(time, arr.get(i).x);
                break;
            }
        }

        return time;
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) arr[i] = s.nextLong();
            long brr[] = new long[n];
            for (int i = 0; i < n; i++) brr[i] = s.nextLong();
            System.out.println(func(n, arr, brr));
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
