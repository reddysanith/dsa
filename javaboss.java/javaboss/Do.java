public class Do {
    public static void eveodd()
    {
        int point=0;
        int temp=0;
        int eve=0;
        int odd=0;
        int a[]={2,3,5,3};
        for(int i=0;i<a.length;i++)
        {
            if(point!=i)
            {
                if(temp%2==0)
                {
                    eve+=a[i];
                    temp++;
                }
                else{
                    odd+=a[i];
                    temp++;
                }

            }
            if((eve==odd) && (i==a.length-1) )
            {
                System.out.println(point);
            }
            if((i==a.length-1)&&(point<a.length))
            {
                i=0;
               System.out.println(point);
                point++;
               // System.out.println(point);
                temp=0;
            }
        }
    }
    
    public static void main(String args[])
    {
        eveodd();
    }
    
}
