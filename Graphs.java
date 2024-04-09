import java.util.*;
public class Graphs {
    public static void addedge(ArrayList<ArrayList<Integer>> graph,int u,int v)
    {
      graph.get(u).add(v);
    }
    public static void print( ArrayList<ArrayList<Integer>> graph)
    {
        System.out.println(graph);
    }
    public static void bfs( ArrayList<ArrayList<Integer>> graph,boolean visited[],int n)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
       
        while(!q.isEmpty())
        {
            int temp=q.remove();
        if(!visited[temp])
        {
            System.out.print(temp+" ");
            visited[temp]=true;
            for(int i=0;i<graph.get(temp).size();i++)
            {
            q.add(graph.get(temp).get(i));
            }
        }
        }
    }
   
    public static void dfs( ArrayList<ArrayList<Integer>> graph,int n,int visited[])
    {
        // int visited[]=new int[graph.size()];
        if(visited[n]!=1)
        {
       System.out.print(n+" ");
        }
       visited[n]=1;
       for(int i=0;i<graph.get(n).size();i++)
       {
        if(visited[graph.get(n).get(i)]!=1)
        {
            dfs(graph,graph.get(n).get(i),visited);
        }
       // return;
       }
    }
      
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
         int vi[]=new int[V+1];
         int count=0;
         ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
         for(int i=0;i<V;i++)
         {
             graph.add(new ArrayList<>());
         }
         for(int i=0;i<V;i++)
         {
             for(int j=0;j<adj.get(i).size();j++)
             {
                 if(adj.get(i).get(j)==1)
                 {
                     graph.get(i).add(j);
                 }
             }
         }
        
        for(int j=0;j<V;j++)
        {
    
               if(vi[j]!=1)
               {
               count++;
               dfs(graph,j,vi);
               }
        }
        return count;
    }
}
class Pair{
    int first;
    int second;
    Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public static void bfs(char[][] grid,int r,int c,int[][] vi)
    {
        Queue<Pair> q=new LinkedList<Pair>();
        int n=grid.length;
        int m=grid[0].length;
        q.add(new Pair(r,c));
        vi[r][c]=1;
        while(!q.isEmpty())
        {
           int lr=q.peek().first;
           int lc=q.peek().second;
            q.remove();
            for(int delr=-1;delr<=1;delr++)
            {
                for(int delc=-1;delc<=1;delc++)
                {
                   int nr=lr+delr;
                   int cr=lc+delc;
                    if(nr>=0 && nr<n && cr>=0 && cr<m&& vi[nr][cr]==0&& grid[nr][cr]=='1')
                    {
                        vi[nr][cr]=1;
                        q.add(new Pair(nr,cr));
                    }
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vi[][]=new int[n][m];
        int count=0;
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<m;c++)
            {
                if(vi[r][c]==0&&grid[r][c]=='1')
                {
                count++;
                bfs(grid,r,c,vi);
                }
            }
        }
        return count;
        
    }
}
class Pair{
    int first;
    int second;
    Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution
{
    public static void bfs(int[][] grid,int r,int c,int[][] vi,int p)
    {
        Queue<Pair> q=new LinkedList<Pair>();
        int n=grid.length;
        int m=grid[0].length;
        q.add(new Pair(r,c));
        vi[r][c]=1;
        while(!q.isEmpty())
        {
           int lr=q.peek().first;
           int lc=q.peek().second;
            q.remove();
            for(int delr=-1;delr<=1;delr++)
            {
                for(int delc=-1;delc<=1;delc++)
                {
                   int nr=lr+delr;
                   int cr=lc+delc;
                    if(nr>=0 && nr<n && cr>=0 && cr<m&& vi[nr][cr]==0&& grid[nr][cr]==1)
                    {
                        vi[nr][cr]=1;
                        grid[nr][cr]=p;
                        q.add(new Pair(nr,cr));
                    }
                }
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
         int n=image.length;
        int m=image[0].length;
        int vi[][]=new int[n][m];
        int count=0;
        if(image[sr][sc]==1)
        {
            image[sr][sc]=2;
        }
    
                bfs(image,sr,sc,vi,newColor);
                
        return image;

        
    }
}
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        int n=s.nextInt();
        int e=s.nextInt();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++)
        {
            int u=s.nextInt();
            int v=s.nextInt();
            addedge(graph,u,v);
        }
        boolean visited[]=new boolean[n];
        print(graph);
        //public static boolean visited1[]=new boolean[graph.size()];
        bfs(graph,visited,n);
        System.out.println();
        int visited1[]=new int[graph.size()];

        dfs(graph,0,visited1);
    }
}
