import java.util.*;
import java.lang.*;
import java.io.*;

public class A630
{
    public static void func(int a, int b, int c, int d, int x, int y, int x1, int y1, int x2, int y2){
        //horizontal
        if (a == b){
            if (a == 0){
                //ok
            }
            else{
                if (x - 1 >= x1 || x + 1 <= x2){
                    //ok
                }
                else{
                    System.out.println("No");
                    return;
                }
            }
        }
        else{
            int p = a - b;
            if (p > 0){ // go left
                if (x - p >= x1){
                    //ok
                }
                else{
                    System.out.println("No");
                    return;
                }
            }
            else{
                p = -p;
                if (x + p <= x2){
                    //ok
                }
                else{
                    System.out.println("No");
                    return;
                }
            }
        }


        //vertical
        if (c == d){
            if (c == 0){
                //ok
            }
            else{
                if (y - 1 >= y1 || y + 1 <= y2){
                    //ok
                }
                else{
                    System.out.println("No");
                    return;
                }
            }
        }
        else{
            int p = c - d;
            if (p > 0){ 
                if (y - p >= y1){
                    //ok
                }
                else{
                    System.out.println("No");
                    return;
                }
            }
            else{
                p = -p;
                if (y + p <= y2){
                    //ok
                }
                else{
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            int x = s.nextInt();
            int y = s.nextInt();
            int x1 = s.nextInt();
            int y1 = s.nextInt();
            int x2 = s.nextInt();
            int y2 = s.nextInt();
            func(a,b,c,d,x,y,x1,y1,x2,y2);
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
