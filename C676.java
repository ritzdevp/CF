import java.util.*;
import java.lang.*;
import java.io.*;

public class C676
{
    public static void func(String str){
        int n = str.length();
        int j = n - 1;
        boolean palin = true;
        for (int i = 0; i < n / 2; i++){
            if (str.charAt(i) != str.charAt(j)){
                palin = false;
                break;
            }
            j--;
        }
        if (palin){
            System.out.println(0);
            return;
        }

        System.out.println(3);
        System.out.println("R " + (n - 1));
        System.out.println("L " + (n));
        System.out.println("L 2");
        return;
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        String str = s.nextLine();
        func(str);
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
