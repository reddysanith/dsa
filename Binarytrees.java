import java.util.*;

public class Binarytrees {
    static class Node{
        int data;
        Node left;
        Node right;
         Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
         }
    }  
    static class Binarytree{
        static int id=-1;
        public static Node Buildtree(int nodes[])
        {
          id++;
          if(nodes[id]==-1)
          {
            return null;
          }
          Node newNode=new Node(nodes[id]);
          newNode.left=Buildtree(nodes);
          newNode.right=Buildtree(nodes);
          return newNode;
        }

    }  
    public static Node root;
    
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);

    }
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);

    }
    public static void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);

    }
    public static int count(Node root)                                 //       1
    {                                                                  //    2     3
        if(root==null)                                                 //  4   5 6   7
        {
            return 0;
        }
        int left=count(root.left);
        int right=count(root.right);
        return left+right+1;
    }
    public static int sum(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=sum(root.left);
        int right=sum(root.right);
        return left+right+root.data;

    }
    public static void levelorder(Node root)
    {
       if(root==null)return;
       Queue<Node> q=new LinkedList<>();
       q.add(root);
       while(!q.isEmpty())
       {
        Node curr=q.remove();
        if(curr!=null)
        {
            System.out.print(curr.data);
            q.add(curr.left);
            q.add(curr.right);
        }
        else{
            break;
        }
       }
    }
    public static void level2(Node root)
    {
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node curr=q.remove();
            if(curr==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data);
                if(curr.left!=null)
                {
                q.add(curr.left);
                }
                if(curr.right!=null)
                {
                q.add(curr.right);
                }
            }
        } 
    }
   public static int depth(Node root)
   {
    if(root==null)
    {
        return 0;
    }
    int left=depth(root.left)+1;
    int right=depth(root.right)+1;
    return Math.max(left,right);
   }
   public static void levelsum(Node root)
    {
        int sum=0;
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node curr=q.remove();
            if(curr==null)
            {
                System.out.println(sum);
                sum=0;
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                sum+=curr.data;
                if(curr.left!=null)
                {
                q.add(curr.left);
                }
                if(curr.right!=null)
                {
                q.add(curr.right);
                }
            }
        } 
    }
   



    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree=new Binarytree();
       //Node root= tree.Buildtree(nodes);
      root=new Node(1);
      root.left=new Node(2);
      root.right=new Node(3);
      root.left.left=new Node(4);
      root.left.right=new Node(5);
      root.right.left=new Node(6);
      root.right.right=new Node(7);
      // System.out.println(root.left.left.data);
      //preorder(root);
      //inorder(root);
      //postorder(root);
      //System.out.println(count(root));
      //System.out.println(sum(root));
      //levelorder(root);
      //level2(root);
      //System.out.println(depth(root));
      levelsum(root);

    }
}
