import java.util.Stack;
public class Stack1{
    public static void rectangle(int a[])
    {
      Stack<Integer> st=new Stack<>();
      int nsR[]=new int[a.length];
      int nsL[]=new int[a.length];
      for(int i=a.length-1;i>=0;i--)
      {
      while(!st.isEmpty()&&a[i]<a[st.peek()])
      {
         st.pop();
      } 
      if(st.isEmpty())nsR[i]+=a.length;
      else nsR[i]+=st.peek();
      st.push(i);
    }
    for(int i=0;i<a.length;i++)
      {
      while(!st.isEmpty()&&a[i]<a[st.peek()])
      {
         st.pop();
      } 
      if(st.isEmpty())nsL[i]+=-1;
      else nsL[i]+=st.peek();
      st.push(i);
    }
    int b=0,max=0;
    for(int i=0;i<a.length;i++)
    {
      b=(nsR[i]-nsL[i]-1)*a[i];
      max=Math.max(max,b);

    }
    System.out.println(max);
    }
    public static boolean brackets(String s)
    {
        Stack<Character> st=new Stack<>();
      for(int i=0;i<s.length();i++)
      {
        char d=s.charAt(i);
        if(d=='{'|d=='('||d=='[')
        {
          st.push(d);
        }
        else if(st.isEmpty())
        {
            return false;
        }
        else
        {
            if(d=='}') d='{';
            else if(d==']') d='[';
            else d='(';
            if(d!=st.peek())return false;            
            else{
              st.pop();
            }
        }
    }
    if(st.isEmpty())return true;
    else return false;
      }
      public static void prefix()
      {
        for(int i=a.length-1;i>=0;i--)
        {
        while(!st.isEmpty()&&a[i]<a[st.peek()])
        {
           st.pop();
        } 
        if(st.isEmpty())nsR[i]+=a.length;
        else nsR[i]+=st.peek();
        st.push(i);
      }
      }
    
    public static void main(String[] args) {
        //int a[]={2,1,5,6};
        //rectangle(a);
        //prefix();
        String s="{}()[]";
       System.out.println(brackets(s));
        
    }
}