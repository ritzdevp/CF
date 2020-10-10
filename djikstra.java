import java.util.*;
import java.lang.*;
import java.io.*;

public class Dijkstra
{
    public static int[] dijkstra(ArrayList<ArrayList<Integer>> g, int src, int V){
        int dist[] = new int[V];
        boolean vis[] = new boolean[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 0; i < V; i++){
            int minIndex = minDistIndex(dist, vis);
            vis[minIndex] = true;
            for (int j = 0; j < V; j++){
                int newdist = dist[minIndex] + g.get(minIndex).get(j);
                if (!vis[j] && newdist < dist[j] && g.get(minIndex).get(j) != 0){
                    dist[j] = newdist;
                }
            }
        }
        return dist;
    }
    
    public static int minDistIndex(int dist[], boolean vis[]){
        int V = dist.length;
        int mindist = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < V; i++){
            if (dist[i] < mindist && !vis[i]){
                mindist = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}