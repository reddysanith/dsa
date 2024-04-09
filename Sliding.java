import java.util.ArrayList;
import java.util.HashMap;

public class Sliding {
    public static void mirrorslide(int a[])
        {
          int left=0;
          int right=0;
          int sum=0;
          int maxsum=0;
          while(right<a.length)
          {
            sum+=a[right];
            if(sum%7==0)
            {
                maxsum=Math.max(right-left+1,maxsum);
                sum-=a[left];
                left++;
            }
            right++;
            

             
          }
          System.out.println(maxsum);
        }
        public static void firstneg(int a[],int k)
        {
            ArrayList<Integer> neg =new ArrayList<>();
            int left=0;
            int right=0;
            int p=0;
            while(right<a.length)
            {
                if(a[right]<0)neg.add(a[right]);//result array size n-k+1
                if(right-left+1==k)
                {
                    if(p==neg.size())
                    {
                        System.out.println(0);
                    }
                    else{
                        System.out.println(neg.get(p));
                    }
                    if(p!=neg.size()&&a[left]==neg.get(p))p++;
                    left++;
                }
                right++;
            }
             
        }
        public static void anagram(String s1,String s2)
        {
           if(s1.length()!=s2.length())System.out.println("not anagram");
           else{
           HashMap<Character,Integer> map=new HashMap<>();
           for(int i=0;i<s1.length();i++)
           {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
           }
           for(int i=0;i<s2.length();i++)
           {
            map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
           }
           int j=1;
           for(char c: map.keySet())
           {
            if(map.get(c)!=0)System.out.println(j--);
           }
           System.out.println(j);
        }
        }
        public static void isanagram1(String s3,String s4)
        {
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<s4.length();i++)
            {
                map.put(s4.charAt(i),map.getOrDefault(s4.charAt(i), 0)+1);
            }
            int left=0;
            int right=0;
            int count=s4.length();
            int ans=0;
            while(right<s3.length())
            {
                char c1=s3.charAt(right);
              if(map.containsKey(c1))
              {
                map.put(c1,map.get(c1)-1);
                if(map.get(c1)==0)count--;
              }
              if(right-left+1==s4.length())
              {
                if(count==0)ans++;
                char c2=s3.charAt(left);
                if(map.containsKey(c2))
                {
                    map.put(c2,map.get(c2)+1);
                    if(map.get(c2)==1)count++;
                } 
                left++;
              }
              right++;
            }
            System.out.println(ans);
        }
    public static void main(String args[])
    {
        int a[]={7,3,5,1,6,2,14,10};
        int k=3;
        String s1="act";
        String s2="cam";
        String s3="actcattaccta";
        String s4="act";
       mirrorslide(a);
       // firstneg(a,k);
       // anagram(s1,s2);
        //isanagram1(s3,s4);

    }
    
}
