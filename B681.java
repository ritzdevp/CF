import java.util.*;
import java.lang.*;
import java.io.*;

public class B681
{

    static class Pair{
        public int start;
        public int end;
        public Pair(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    public static void printlist(ArrayList<Pair> arr){
        for (int i = 0; i < arr.size(); i++){
            System.out.println("start=" + arr.get(i).start + "  end=" + arr.get(i).end);
        }
    }

    public static long func(int a, int b, String str){
        ArrayList<Pair> arr = new ArrayList<>();
        //round 1
        long ans1 = 0;
        int len = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '1'){
                len++;
            }
            else{
                if (len != 0){
                    ans1++;
                    arr.add(new Pair(i - len, i - 1));
                }
                len = 0;
            }
        }
        if (len != 0){
            ans1++;
            arr.add(new Pair(str.length() - len, str.length() - 1));
            len = 0;
        }

        ans1 = a * ans1;

        //printlist(arr);
        if (arr.size() == 0) return 0;
        //round 2
        long ans2 = 0;
        //Queue<Pair> q = new LinkedList<>();
        //q.add(arr.get(0));
        for (int i = 1; i < arr.size(); i = i + 2){
            Pair p = arr.get(i - 1);
            int cost1 = a * 2;
            int cost = a + (arr.get(i).start - p.end - 1) * b;
            if (cost1 >= cost){
                //System.out.println("adding " + cost);
                ans2 += cost;
                //q.add(new Pair(p.start, arr.get(i).end));
            }
            else if (cost1 < cost){
                //System.out.println("adding " + cost1);
                ans2 += cost1;
                //q.add(arr.get(i));
            }
        }
        if (arr.size() == 1 || arr.size() % 2 != 0){
            ans2 += a;
        }
        return ans2;
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            int a = s.nextInt();
            int b = s.nextInt();
            String str = s.nextLine();
            System.out.println(func(a, b, str));
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
