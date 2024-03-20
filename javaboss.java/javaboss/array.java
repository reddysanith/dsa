import java.io.*;
import java.util.*;
public class array{

public static void dutchnationalflag(int [] a)
{
    int i,j;
    int low=0;
    int mid=0;
    int high=a.length-1;
    for(i=0;i<a.length;i++)
    {
        if(a[mid]==0)
        {
            j=a[low];
            a[low]=a[mid];
            a[mid]=j;
            low++;
            mid++;
        }
        else if(a[mid]==1)
            mid++;
        else{
            j=a[mid];
            a[mid]=a[high];
            a[high]=j;
            high--;
         }    
    }
}
public static void kadane(int [] nums)
{
        int currentsum = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentsum= currentsum+nums[i];
            if(currentsum<0)currentsum=0;
            maxSoFar = Math.max(maxSoFar,currentsum);
        }

        System.out.println(maxSoFar);


}
public static void print(int [] a)
{
    for(int i=0;i<a.length;i++)
    {
        System.out.println(a[i]);
    }
}
public static void boyer(int [] a)
{
    int votes=0,i,maj=-1,count=0;
    for(i=0;i<a.length;i++)
    {
        if(votes==0)
        {
        maj=a[i];
        votes=1;
        }
        if(maj==a[i])
        {
        votes++;
        }
        else votes--;
    }
        for(i=0;i<a.length;i++)
        {
            if(a[i]==maj)
            {
                count++;
            }
        }
        if(count>(a.length-1)/2)
        {
            System.out.println("majority ele is  "+maj);
        }
        else
        {
             System.out.println("no maj");
        }
}
public static void twosum(int [] a,int target)
{
    int i,j,left=0,right=0;
    for(i=0;i<a.length;i++)
    {
        for(j=i+1;j<a.length;j++)
        {
            if(target==a[i]+a[j])
            {
                System.out.println(i+"g "+j);
                break;
            }
        }
    }
    right=1;
    for(i=0;left<a.length;i++)
    {
       if(target==a[left]+a[right])
       {
        System.out.println(left+" "+right);
                break;
       }
       
       if(right==a.length-1)
       {
        left++;
        right=left;
       }
       right++;
       
       }
    }
    

public static void zerosatend(int a[])
{
    int i,left=0,right=0,swap;
    for(i=0;i<a.length;i++)
    {
        if(a[right]==0)
        {
            right++;
        }
        else{
           swap=a[right];
           a[right]=a[left];
           a[left]=swap;
           right++;
           left++;
        }
    }
}
    public static void raintrap(int a[])
    { if(a.length>2)
    {
        int i,totalvol=0,waterleft=0;
        int leftlarge[]=new int[a.length];
        int rightlarge[]=new int[a.length];
        leftlarge[0]=a[0];
        for(i=1;i<a.length;i++)
        {
            leftlarge[i]=Math.max(leftlarge[i-1],a[i]);
        }
        rightlarge[a.length-1]=a[a.length-1];
         for(i=a.length-2;i>=0;i--)
        {
            rightlarge[i]=Math.max(rightlarge[i+1],a[i]);
        }
        for(i=0;i<a.length;i++)
        {
            waterleft=Math.max(leftlarge[i],rightlarge[i]);
            totalvol+=(waterleft-a[i]);
        }
System.out.println("total area or vol of water is "+totalvol);


    }
    }

public static void main(String args[])
{
    int a[]={3,2,3};
     int target=10;
    //dutchnationalflag(a);
   //kadane(a);
  // boyer(a);
   // print(a);
   // twosum(a,target);
   // zerosatend(a);
    //print(a);
    raintrap(a);
   
}

}