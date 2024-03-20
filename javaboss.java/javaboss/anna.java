import java.io.*;
import java.util.*;

class anna
{
    public static void main(String args[])
    {
        
    Scanner s=new Scanner(System.in);
        int i;
        int r=s.nextInt();
        int c=s.nextInt();
        char a[]=new char[r];
        for(i=0;i<r;i++)
        {
             a[i]=s.next().charAt(0);
        }
        int h=r,k=r-1;
        char j;
         for(i=0;i<r;i++)
         {
       
           if((r-1)%2==0)
              {
                if(i%2==0 && (h=h-2)>0)
                   {
                     j=a[i];
                     a[i]=a[h];
                     a[h]=j;
                   }
                    
                else
               {
                if(k>0)
                 {
                   j=a[i];
                   a[i]=a[k];
                   a[k]=j;
                   k=k-2;
                  }
                }
            }
        else
            {
                if(i%2==0 && k>=0)
                {
                j=a[i];
                a[i]=a[k];
                a[k]=j;
                k=k-2;
                }
                else
                {
                    if(h>=0)
                    {
                     h=h-2;
                     j=a[i];
                     a[i]=a[h];
                      a[h]=j;
                    }      
                    
                }
            }
        
        
         }
        char b[][]=new char[r][c];
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                b[j][i]=a[j];
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}