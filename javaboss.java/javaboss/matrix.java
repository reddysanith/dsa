public class matrix{
public static void transpose(int [] [] a) {
        int i=0,j=0,k,temp;
                k=a[i].length;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<i;j++)
            {
                temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
                
            }
        
        }
} 
        public static void print(int [] [] a)
        {
            int i,j;
         for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            {
                
                System.out.print(a[i][j]+" ");

            }
            System.out.println();                                                                                      
        }                                  
                    
  }

    
    public static void mirror90(int [] [] a) {
        int i=0,j=0,k,temp;
                k=a.length-1;
        for(i=0;i<(a.length/2);i++,k--)
        {
            for(j=0;j<a.length;j++)
            {
                temp=a[i][j];
                a[i][j]=a[k][j];
                a[k][j]=temp;
                
            }
        
        }
                                   //9 10 11 12
                                                                    //13 14 15 16

    }
    public static void rowjump(int [] [] a)
    {
         int i=0,j=0,k,temp,right,left=0;
                k=a.length-1;
                right=k;
        for(i=0;i<a.length;i++)
        {
            left=0;
            right=k;
            while(left<right)
            {
                temp=a[i][left];
                a[i][left]=a[i][right];
                a[i][right]=temp;
                left++;
                right--;
            }
        }
    }
     public static void outer(int [] [] a) 
   {
        int i=0,j=0,k;
                k=a.length-1;
        for(i=0;i<4;i++)
        {
                                                                        //1 2 3 4
                                                                        //5 6 7 8
                                                                        //9 10 11 12
                                                                        //13 14 15 16
                                                                        
            if(i==0)
            {
                for(j=0;j<a.length;j++)
                    {
                        System.out.print(a[i][j]+" ");
                    }
            }
            if(i==1)
            {
                for(j=i;j<a.length;j++)
                {
                    System.out.println("        "+a[j][k]);
                }
            } 
            if(i==2)
            {
                for(j=k-1;j>=0;j--)
                {
                    System.out.print(a[k][j]);                          //1 2 3 4
                                                                        //5 6 7 8
                                                                        //9 10 11 12
                                                                        //13 14 15 16
                }
            }  
            if(i==3)
            {
                for(j=0;j<2;j++,i--)
                {
                    System.out.println(a[i][0]);
                }
            }     
        }   
     }     
public static void main(String[] sanith)
{
    
    int [] [] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
   // transpose(a);
   // mirror90(a);
   //rowjump(a);
   outer(a);
    //print(a);

}
}