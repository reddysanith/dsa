import java.util.*;
public class contest {
    //A farmer needs your help. He has N cows, numbered from 1 to N, all are standing in a row. Each cow has a breed ID: 1, 2, and 3. 
    //Farmer would like your help counting the number of cows of each breed that lie within certain intervals of the ordering.
    // Sample Input 0

    // 6 3
    // 2
    // 1
    // 1
    // 3
    // 2
    // 1
    // 1 6
    // 3 3
    // 2 4
    // Sample Output 0
    
    // 3 2 1
    // 1 0 0
    // 2 0 1

    public static void farmer() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int q=s.nextInt();
        int a[]=new int[n];
        int one=0;
        int two=0;
        int three=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();        
        }
        int b[][]=new int[q][2];
        for(int i=0;i<q;i++)
        {
            b[i][0]=s.nextInt();
            b[i][1]=s.nextInt();
        }
        for(int i=0;i<q;i++)
        {
            for(int j=b[i][0]-1;j<b[i][1];j++)
            {
                if(a[j]==1)one++;
                else if(a[j]==2)two++;
                else three++;
                
            }
            System.out.println(one+" "+two+" "+three);
            one=0;
            two=0;
            three=0;
            
        }
            
    }
   // Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]). Print running sum of array
//    Sample Input 0

// 5
// 1 2 3 4 5
// Sample Output 0

// 1 3 6 10 15
// Sample Input 1

// 1
// 5
// Sample Output 1

// 5
public static void runningsum() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=s.nextInt();
    }
    int temp=a[0];
    System.out.print(a[0]+" ");
    for(int i=1;i<n;i++)
    {
        temp=temp+a[i];
        System.out.print(temp+" ");
    }
}
//Shyam has N empty boxes. for every i(1<=i<=N), ith box is a cube with side length Ai. 
//Shyam can put a box i into a box j if following conditions are met.
// Sample Input 0

// 3
// 1 2 3
// Sample Output 0

// 1
// Explanation 0

// it is possible to put box 1 into box 2, and 2 into 3.

// Sample Input 1

// 4
// 4 2 4 3
// Sample Output 1

// 2
// Explanation 1

// Shyam can put box 2 into box 3, and box 4 into box 1.
 public static void box() {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        int res=Integer.MIN_VALUE;
        for(int i : map.keySet()){
            if(map.get(i)>res) res=map.get(i);
        }
        System.out.println(res);
    }
    static int out=0;
    public static int cow(int a[],int i,int count,int sum)
    {
        
        if(i==a.length-1)
        {
            return out;
        }
        if(sum%7==0)
        {
            if(count>out)
            {
                out=count;
            }
        }
        cow(a,i+1,count+1,sum+a[i]);
        cow(a,i+1,count,sum);
        return out;
    }
    public static void main(String[] args) {
        //box();
        //runningsum();
        //farmer();
        int a[]={7,3,5,1,6,2,14,10};
       System.out.println(cow(a,0,0,0));
    }


}
    

