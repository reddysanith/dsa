import java.util.ArrayList;

public class Recursion{
    public static void print1to5(int start,int end)
    {
        if(start>end)return;
      System.out.println(start);
      print1to5(start+1,end);
    }
    public static void print5to1(int start,int end) 
    {
        if(start<1)return;
        print5to1(start-1,end);
        System.out.println(start);
    }
    public static void sum(int sum,int start,int end)
    {
        if(start>end)
        {
            System.out.println(sum);
            return;
        }
        sum(sum+start,start+1,end);
    }
    public static int fact(int n)
    {
        if(n==0)
        {
        return 1;
        }
        return fact(n-1)*n;
    }
    public static void substr(String s,int i,String newstr)
    {
       // for(i=0;i<s.length();i++)
        //{
            if(s.length()==i)
            {
                System.out.println(newstr);
                return;
            }
            substr(s,i+1,newstr);
            substr(s,i+1,newstr+=s.charAt(i));
            
        //}
    }
    public static void permutations(String s,String prm)
    {
        if(s.length()==0)
        {
            System.out.println(prm);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            String newstr=s.substring(0, i)+s.substring(i+1, s.length());
            permutations(newstr,prm+c);
        }
    }
    public static void perm1(int a[],boolean b[],ArrayList<Integer> al)
    {
       
        if(al.size()==a.length)
        {
            System.out.println(al);
            return;
        }
        for(int i=0;i<a.length;i++)
        {
            if(b[i]==false)
            {
                b[i]=true;
            al.add(a[i]);
            perm1(a,b,al);
            al.remove(al.size()-1);
            b[i]=false;
            }
        }
    }
    public static void target(int a[],int tar,int i,ArrayList<Integer> al)
    {
       // ArrayList<Integer> al=new ArrayList<>();
        if(i==a.length-1)
        {
            if(tar==0)
            {
                System.out.println(al);
            }
            return;
        }
            if(a[i]<=tar)
            {
                al.add(a[i]);
             target(a,tar-a[i],i,al);
             al.remove(al.size()-1);
            }
            target(a,tar,i+1,al);
    }
    public static void main(String args[])
    {
     // print1to5(1,5);
      //print5to1(5,1);
      //sum(0,1,1000);
      //substr("abcd",0,"");
      //System.out.println(fact(5));
      String str="abc";
      String prm="";
      //permutations(str,prm);
      int a[]={1,2,3,4};
      boolean b[]=new boolean[a.length];
      ArrayList<Integer> al=new ArrayList<>();
     // perm1(a,b,al);
     target(a,3,0,al);
    }
}
