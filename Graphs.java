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
