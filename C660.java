import java.util.*;
import java.lang.*;
import java.io.*;

public class C660
{
    public static String func(int n, int m, int pop[], int h[], ArrayList<ArrayList<Integer>> adj){
        
    }

	public static void main (String[] args) throws java.lang.Exception{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int m = s.nextInt();
            int pop[] = new int[n];
            for (int i = 0; i < n; i++) pop[i] = s.nextInt();
            int h[] = new int[n];
            for (int i = 0; i < n; i++) h[i] = s.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < n + 1; i++) adj.add(new ArrayList<>());
            for (int i = 0; i < n - 1; i++){
                int x = s.nextInt();
                int y = s.nextInt();
                adj.get(x).add(y);
                adj.get(y).add(x);
            }
            System.out.println(func(n, m, pop, h, adj))
        }
	}
}
