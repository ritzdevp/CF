import java.util.*;
import java.lang.*;
import java.io.*;

public class A659
{
    public static void func(int n, int arr[]){
        int count = 1;
        int max = arr[0];
        for (int i = 0; i < n; i++) max = Math.max(max, arr[i]);
        if (max == 0) max = 10;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++){
            sb.append('a');
        }
        System.out.println(sb);
        count++;
        char c = (char)(sb.charAt(sb.length() - 1));

        for (int i = 0; i < n; i++){
            StringBuilder tempSb = new StringBuilder();
            for (int j = 0; j < arr[i]; j++){
                tempSb.append(sb.charAt(j));
            }
            c = (char)(c + 1);
            if (c > 'z'){
                c = 'a';
            }

            for (int j = tempSb.length(); j < max + 1; j++){
                if (j < sb.length() && c == sb.charAt(j)){
                    c = (char)(c + 1);
                    if (c > 'z'){
                        c = 'a';
                    }
                }
                tempSb.append(c);
            }
            System.out.println(tempSb);
            count++;
            sb = tempSb;
        }
    }

	public static void main (String[] args) throws java.lang.Exception{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = s.nextInt();
            func(n, arr);
        }
	}
}
