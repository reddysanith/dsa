//import java.io.*;
import java.util.*;
public class Movie{
    public static void box()
    {
        Scanner ob=new Scanner(System.in);
        int m=ob.nextInt();
        int n=ob.nextInt();
        int a[][]=new int[m][n];
        int count=1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=count;
                count++;
                System.out.print(a[i][j]);

            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        box();
    }
}

    
