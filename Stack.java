import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> al=new ArrayList<>();
    public  boolean isEmpty()
    {
      if(al.size()==0)
      {
      return true;
      }
      else{
        return false;
      }
    }
    public void push(int ele)
    {
      al.add(ele);
    }
    public int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        else{
            return al.remove(al.size()-1);
        }
    }
    public int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        else{
            return al.get(al.size()-1);
        }
    }
    public void rightGreat(int a[])
    {
      int prefix[]=new int[a.length];
      for(int i=a.length-1;i>=0;i--)
      {
        while(!isEmpty() && a[i]>peek())
        {
            pop();
        }
        if(isEmpty())
        {
            prefix[i]=-1;
        }
        else 
        {
            prefix[i]=peek();
        }
        push(i);
      }
      for(int i=0;i<prefix.length;i++)
      {
      System.out.println(prefix[i]);
      }
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,4};
        rightGreat(a);
    }
}