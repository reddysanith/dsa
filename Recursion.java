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
            substr(s,i+1,newstr+=s.charAt(i));
            substr(s,i+1,newstr);
        //}
    }
    public static void main(String args[])
    {
     // print1to5(1,5);
      //print5to1(5,1);
      //sum(0,1,1000);
      substr("abcd",0,"");
      //System.out.println(fact(5));
    }
}
