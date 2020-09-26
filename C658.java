import java.util.*;
import java.lang.*;
import java.io.*;

public class C658
{

    public static void func(int n, String a, String b){
        if (a.equals(b)){
            System.out.println(0);
            return;
        }
        int count = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if (a.charAt(i) != b.charAt(i)){
                count += 3;
                temp.add(i + 1);
                temp.add(1);
                temp.add(i + 1);
            }
        }
        System.out.print(count + " ");
        for (int i = 0; i < temp.size(); i++){
            System.out.print(temp.get(i) + " ");
        }
        System.out.println();
    }

	public static void main (String[] args) throws java.lang.Exception{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            s.nextLine();
            String a = s.nextLine();
            String b = s.nextLine();
            func(n, a, b);
        }
	}
}
