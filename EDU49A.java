import java.util.*;
import java.lang.*;
import java.io.*;

public class EDU49A
{

	public static String func(String str, int n){
		int j = n - 1;
		for (int i = 0; i < n/2; i++){
			char left = str.charAt(i);
			char right = str.charAt(j);

			int x = Math.max(left, right) - Math.min(left, right);
			if (x != 0 && x != 2){
				return "NO";
			}
			j--;
		}
		return "YES";
	}

	public static void main (String[] args) throws java.lang.Exception{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- != 0){
			int n = s.nextInt();
			s.nextLine();
			String str = s.nextLine();
			System.out.println(func(str, n));
		}
        
	}
}
