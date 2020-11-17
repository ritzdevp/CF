import java.util.*;
import java.lang.*;
import java.io.*;

public class C684
{
    public static class Pair{
        public int x;
        public int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static ArrayList<Pair> cat1(int arr[][], int i, int j){
        ArrayList<Pair> ans = new ArrayList<>();
        if (arr[i][j] == 1){
            ans.add(new Pair(i, j));
            arr[i][j] = 0;
            ans.add(new Pair(i + 1, j));
            arr[i + 1][j] = 1;
            ans.add(new Pair(i, j + 1));
            arr[i][j + 1] = 1;
            ArrayList<Pair> temp = new ArrayList<>(cat2(arr, i, j));
            for (i = 0; i < temp.size(); i++){
                ans.add(temp.get(i));
            }
        }
        else if (arr[i + 1][j] == 1){
            ans.add(new Pair(i + 1, j));
            arr[i + 1][j] = 0;
            ans.add(new Pair(i, j));
            arr[i][j] = 1;
            ans.add(new Pair(i + 1, j + 1));
            arr[i + 1][j + 1] = 1;
            ArrayList<Pair> temp = new ArrayList<>(cat2(arr, i, j));
            for (i = 0; i < temp.size(); i++){
                ans.add(temp.get(i));
            }
        }

        else if (arr[i][j + 1] == 1){
            ans.add(new Pair(i, j + 1));
            arr[i][j + 1] = 0;
            ans.add(new Pair(i, j));
            arr[i][j] = 1;
            ans.add(new Pair(i + 1, j + 1));
            arr[i + 1][j + 1] = 1;
            ArrayList<Pair> temp = new ArrayList<>(cat2(arr, i, j));
            for (i = 0; i < temp.size(); i++){
                ans.add(temp.get(i));
            }
        }
        else if (arr[i + 1][j + 1] == 1){
            ans.add(new Pair(i + 1, j + 1));
            arr[i + 1][j + 1] = 0;
            ans.add(new Pair(i, j + 1));
            arr[i][j + 1] = 1;
            ans.add(new Pair(i + 1, j));
            arr[i + 1][j] = 1;
            ArrayList<Pair> temp = new ArrayList<>(cat2(arr, i, j));
            for (i = 0; i < temp.size(); i++){
                ans.add(temp.get(i));
            }
        }
        return ans;

    }

    public static ArrayList<Pair> cat2(int arr[][], int i, int j){
        ArrayList<Pair> ans = new ArrayList<>();
        if (arr[i + 1][j] == 1 && arr[i + 1][j + 1] == 2){
            ans.add(new Pair(i + 1, j));
            arr[i + 1][j] = 0;
            ans.add(new Pair(i, j));
            arr[i][j] = 1;
            ans.add(new Pair(i, j + 1));
            arr[i][j + 1] = 1;
            ArrayList<Pair> temp = new ArrayList<>(cat3(arr, i, j));
            for (i = 0; i < temp.size(); i++){
                ans.add(temp.get(i));
            }
        }

        else if (arr[i][j] == 1 && arr[i][j + 1] == 1){
            ans.add(new Pair(i, j));
            arr[i][j] = 0;
            ans.add(new Pair(i + 1, j));
            arr[i + 1][j] = 1;
            ans.add(new Pair(i + 1, j + 1));
            arr[i + 1][j + 1] = 1;
            ArrayList<Pair> temp = new ArrayList<>(cat3(arr, i, j));
            for (i = 0; i < temp.size(); i++){
                ans.add(temp.get(i));
            }
        }
        else if (arr[i][j] == 1 && arr[i + 1][j] == 1){
            ans.add(new Pair(i, j));
            arr[i][j] = 0;
            ans.add(new Pair(i, j + 1));
            arr[i][j + 1] = 1;
            ans.add(new Pair(i + 1, j + 1));
            arr[i + 1][j + 1] = 1;
            ArrayList<Pair> temp = new ArrayList<>(cat3(arr, i, j));
            for (i = 0; i < temp.size(); i++){
                ans.add(temp.get(i));
            }
        }
        else if (arr[i][j + 1] == 1 && arr[i + 1][j + 1] == 1){
            ans.add(new Pair(i, j + 1));
            arr[i][j + 1] = 0;
            ans.add(new Pair(i, j));
            arr[i][j] = 1;
            ans.add(new Pair(i + 1, j));
            arr[i + 1][j] = 1;
            ArrayList<Pair> temp = cat3(arr, i, j);
            for (i = 0; i < temp.size(); i++){
                ans.add(temp.get(i));
            }
        }
        else if (arr[i][j] == 1 && arr[i + 1][j + 1] == 1){
            ans.add(new Pair(i + 1, j + 1));
            arr[i + 1][j + 1] = 0;
            ans.add(new Pair(i, j + 1));
            arr[i][j + 1] = 1;
            ans.add(new Pair(i + 1, j));
            arr[i + 1][j] = 1;
            ArrayList<Pair> temp = new ArrayList<>(cat3(arr, i, j));
            for (i = 0; i < temp.size(); i++){
                ans.add(temp.get(i));
            }
        }
        else if (arr[i][j + 1] == 1 && arr[i + 1][j] == 1){
            ans.add(new Pair(i, j + 1));
            arr[i][j + 1] = 0;
            ans.add(new Pair(i, j));
            arr[i][j] = 1;
            ans.add(new Pair(i + 1, j + 1));
            arr[i + 1][j + 1] = 1;
            ArrayList<Pair> temp = new ArrayList<>(cat3(arr, i, j));
            for (i = 0; i < temp.size(); i++){
                ans.add(temp.get(i));
            }
        }

        return ans;
    }

    public static ArrayList<Pair> cat3(int arr[][], int i, int j){
        ArrayList<Pair> ans = new ArrayList<>();
        if (arr[i][j] == 0){
            ans.add(new Pair(i, j + 1));
            arr[i][j] = 0;
            ans.add(new Pair(i + 1, j));
            arr[i + 1][j] = 0;
            ans.add(new Pair(i + 1, j + 1));
            arr[i + 1][j + 1] = 0;
        }
        else if (arr[i][j + 1] == 0){
            ans.add(new Pair(i, j));
            arr[i][j] = 0;
            ans.add(new Pair(i + 1, j));
            arr[i + 1][j] = 0;
            ans.add(new Pair(i + 1, j + 1));
            //System.out.println("WOWOWOOW " + ans.get(2).x + " " + ans.get(2).y);
            arr[i + 1][j + 1] = 0;
            // for (i = 0; i < ans.size(); i++){
            //     System.out.println(ans.get(i).x + " " + ans.get(i).y + " ");
            // }
        }
        else if (arr[i + 1][j] == 0){
            ans.add(new Pair(i, j));
            arr[i][j] = 0;
            ans.add(new Pair(i, j + 1));
            arr[i][j + 1] = 0;
            ans.add(new Pair(i + 1, j + 1));
            arr[i + 1][j + 1] = 0;
        }
        else if (arr[i + 1][j + 1] == 0){
            ans.add(new Pair(i, j));
            arr[i][j] = 0;
            ans.add(new Pair(i, j + 1));
            arr[i][j + 1] = 0;
            ans.add(new Pair(i + 1, j));
            arr[i + 1][j] = 0;
        }

        // System.out.println("PLWPLW");
        // for (i = 0; i < ans.size(); i++){
        //     System.out.println(ans.get(i).x + " " + ans.get(i).y);
        // }
        return ans;
    }

    public static ArrayList<Pair> cat4(int arr[][], int i, int j){
        ArrayList<Pair> ans = new ArrayList<>();
        ans.add(new Pair(i, j));
        arr[i][j] = 0;
        ans.add(new Pair(i, j + 1));
        arr[i][j + 1] = 0;
        ans.add(new Pair(i + 1, j));
        arr[i + 1][j] = 0;
        return ans;
    }

    public static void func(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        long ans = 0;
        ArrayList<Pair> steps = new ArrayList<>();
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < m - 1; j++){
                //categorize
                int count = 0;
                if (arr[i][j] == 1) count++;
                if (arr[i][j + 1] == 1) count++;
                if (arr[i + 1][j] == 1) count++;
                if (arr[i + 1][j + 1] == 1) count++;
                if (count == 1){
                    ArrayList<Pair> temp = new ArrayList<>(cat1(arr, i, j));
                    for (int k = 0; k < temp.size(); k++){
                        steps.add(temp.get(k));
                    }
                }
                else if (count == 2){
                    ArrayList<Pair> temp = new ArrayList<>(cat2(arr, i, j));
                    for (int k = 0; k < temp.size(); k++){
                        steps.add(temp.get(k));
                    }
                }
                else if (count == 3){
                    //System.out.println("Cat 3!!");
                    ArrayList<Pair> temp = cat3(arr, i, j);
                    for (int k = 0; k < temp.size(); k++){
                        steps.add(temp.get(k));
                    }
                }
                else if (count == 4){
                    ArrayList<Pair> temp = new ArrayList<>(cat4(arr, i, j));
                    for (int k = 0; k < temp.size(); k++){
                        steps.add(temp.get(k));
                    }
                }
            }
        }
        ans = steps.size() / 3;
        System.out.println(ans);
        for (int i = 0; i < steps.size(); i++){
            System.out.print((steps.get(i).x + 1) + " " + (steps.get(i).y + 1)  +" ");
            if ((i+1) % 3 == 0){
                System.out.println();
            }
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.println("SADASDSADASDSAd");
                System.out.println(arr[i][j]);
            }
        }
    }

	public static void main (String[] args) throws java.lang.Exception{
        //Scanner s = new Scanner(System.in);
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- != 0){
            int n = s.nextInt();
            int m = s.nextInt();
            int arr[][] = new int[n][m];
            for (int i = 0; i < n; i++){
                String str = s.nextLine();
                for (int j = 0; j < m; j++){
                    arr[i][j] = Character.getNumericValue(str.charAt(j));
                }
            }
            func(arr);
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
