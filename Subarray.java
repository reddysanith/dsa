public class Subarray {
    public static void sub(int a[],int k)
    {
        int left=0;
        int right=k;
        int sum=0;
        int maxSum=0;
        for(int i=0;i<k;i++)
        {
            sum+=a[i];
        }
        maxSum=Math.max(sum,maxSum);
        while(right<a.length)
        {
            sum+=a[right];
            sum-=a[left];
            maxSum=Math.max(sum,maxSum);
            left++;
            right++;
        }
  System.out.println(maxSum);

    }
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8};
       int k=3;
        sub(a,k);
    }
    
}
