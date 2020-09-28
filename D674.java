import java.util.*;
import java.lang.*;
import java.io.*;

public class D674
{
    public static int func(int n, int arr[]){
        int pre[] = new int[n];
        HashSet<Long> set = new HashSet<>();
        set.add((long)0);
        long sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
            if (set.contains(sum)){
                count++;
                set = new HashSet<>();
                set.add((long)0);
                sum = arr[i];
            }
            set.add((long)sum);
        }
        return count;
    }

	public static void main (String[] args) throws java.lang.Exception{
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();
        System.out.println(func(n, arr));
	}
}
