public class darray{
public static mirrir(int a[][]) {
        
        int i=0,j=0;
        k=a[i].length;
        for(i=0;i<a.length;i++)
        {
            for(j=a.length;j>i;j--)
            {
                temp=a[j][i];
                a[j][i]=a[i][j];
                a[i][j]=temp;
                Syatem.out.print(a[i][j]);
            }
            System.out.println();
        }
        

    }
}
public static void main()
{
    int a[][]={{1,2,3,4,},{6,7,8,9},{10,11,12,13},{14,15,16,17}};
    array(a[][]);

}