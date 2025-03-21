package MY_DSA.Leet;

import java.util.Arrays;

public class Leet3108 {
    int[] parent;

    public int find(int x){
        if(parent[x]==-1)return x;
        return parent[x]=find(parent[x]);
    }

    public void union(int a,int b){
        int pa=find(a);
        int pb=find(b);
        if(pa!=pb){
            parent[pb]=pa;
        }
    }

    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        parent = new int[n];
        Arrays.fill(parent,-1);

        for(int[] edge : edges ){
            union(edge[0],edge[1]);
        }

        int[] ComponentCost=new int[n];
        Arrays.fill(ComponentCost,Integer.MAX_VALUE);

        for(int[] edge : edges){
            int parent=find(edge[0]);
            ComponentCost[parent]&=edge[2];
        }

        int[] ans=new int[query.length];
        int i=0;
        for(int[] q : query){
            int ps=find(q[0]);
            int pe=find(q[1]);
            if(ps!=pe){
                ans[i]=-1;
            }else{
                ans[i]= ComponentCost[ps];
            }
            i++;
        }

        return ans;
    }
}
