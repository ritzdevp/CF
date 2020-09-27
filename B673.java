import java.util.*;
import java.lang.*;
import java.io.*;

public class B673
{
    public static void func(int n, int arr[], int T){
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            if (map.containsKey(arr[i])){
                ArrayList<Integer> temp = map.get(arr[i]);
                temp.add(i);
                map.put(arr[i], temp);
            }
            else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(arr[i], temp);
            }
        }
        int ans[] = new int[n];
        for (Integer c : map.keySet()){
            int x = T - c;
            if (map.containsKey(x)){
                if (map.get(x).size() == 0) continue;
                if (x == c){
                    boolean first = true;
                    for (int i = 0; i < map.get(c).size(); i++){
                        if (first){
                            ans[map.get(c).get(i)] = 0;
                        }
                        else{
                            ans[map.get(c).get(i)] = 1;
                        }
                        first = !first;
                    }
                    map.put(c, new ArrayList<>());
                }
                else{
                    for (int i = 0; i < map.get(c).size(); i++){
                        ans[map.get(c).get(i)] = 0;
                    }
                    map.put(c, new ArrayList<>());
                    for (int i = 0; i < map.get(x).size(); i++){
                        ans[map.get(x).get(i)] = 1;
                    }
                    map.put(x, new ArrayList<>());
                }
            }
            else{
                for (int i = 0; i < map.get(c).size(); i++){
                    ans[map.get(c).get(i)] = 0;
                }
                map.put(c, new ArrayList<>());
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        return;
    }

	public static void main (String[] args) throws java.lang.Exception{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int T = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = s.nextInt();
            func(n, arr, T);
        }
	}
}
