import java.util.*;
class Pair{
    int first;
    int second;
    Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Pair1{
    int row;
    int col;
    int tm;
    Pair(int r,int c,int t)
    {
        this.row=r;
        this.col=c;
        this.tm=t;
    }
}


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
   
    public static void dfs1( ArrayList<ArrayList<Integer>> graph,int n)
    {
        int visited[]=new int[graph.size()];
        if(visited[n]!=1)
        {
       System.out.print(n+" ");
        }
       visited[n]=1;
       for(int i=0;i<graph.get(n).size();i++)
       {
        if(visited[graph.get(n).get(i)]!=1)
        {
            dfs1(graph,graph.get(n).get(i));
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
              // dfs(graph,j,vi);
               }
        }
        return count;
    }


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

    public static void bfs(int[][] grid,int r,int c,int[][] vi,int p,int temp)
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
                    if(nr>=0 && nr<n && cr>=0 && cr<m&& vi[nr][cr]==0&& grid[nr][cr]==temp&& (nr==lr||cr==lc))
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
           int temp=image[sr][sc];
            image[sr][sc]=newColor;
        
    
                bfs(image,sr,sc,vi,newColor,temp);
                
        return image;
    }
    public int orangesRotting(int[][] grid)
    { int c1=0;
    int c2=0;
    int tm=0;
        // Code here
        Queue<Pair> q=new LinkedList<Pair>();
        int n=grid.length;
        int m=grid[0].length;
        int vi[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                vi[i][j]=2;
                q.add(new Pair1(i,j,tm));
                    
                }
                else
                {
                    vi[i][j]=0;
                }
                if(grid[i][j]==1)
                {
                    c1++;
                }
            }
        }
         int dr[]={0,0,-1,1};
        int dc[]={-1,1,0,0};
        int t=0;
        while(!q.isEmpty())
        {
        int i=q.peek().row;
        int j=q.peek().col;
         t=q.peek().tm;
        q.remove();
        for(int k=0;k<4;k++)
        {
                int nr=i+dr[k];
                int nc=j+dc[k];
                if(nr>=0&&nr<n&&nc>=0&&nc<m&&vi[nr][nc]==0&&grid[nr][nc]==1)
                {
                    q.add(new Pair1(nr,nc,t+1));
                    grid[nr][nc]=2;
                    vi[nr][nc]=2;
                    c2++;
                }
            
        }
        }
        if(c1!=c2)return -1;
        else return t;
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

        dfs1(graph,0);
    }
}
