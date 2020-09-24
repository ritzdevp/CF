import java.util.*;
import java.lang.*;
import java.io.*;

public class C672
{
    
    public static long func(int n, int q, int arr[], int temp[][]){
        boolean findMax = true;
        long sum = 0;
        for (int i = 1; i < n; i++){
            if (findMax){
                if (arr[i] > arr[i - 1]){
                    //do nothing
                }else{
                    sum += arr[i - 1];
                    findMax = !findMax;
                }
            }
            else{
                if (arr[i] < arr[i - 1]){
                    //do nothing
                }
                else{
                    sum -= arr[i - 1];
                    findMax = !findMax;
                }
            }
        }
        if (findMax) sum += arr[n - 1];

        return sum;
    }

	public static void main (String[] args) throws java.lang.Exception{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int q = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = s.nextInt();
            int temp[][] = new int[q][2];
            for (int i = 0; i < q; i++){
                temp[i][0] = s.nextInt();
                temp[i][1] = s.nextInt();
            }
            System.out.println(func(n, q, arr, temp));
        }
        
	}
}
