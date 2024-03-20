import java.io.*;
import java.util.*;

public class paracctice {
    static class Node{
        String data;
        Node next;
        Node(String d)
        {
            data=d;
            next=null;
        }
        
    }
    
    public static Node head;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //String p;
        Node temp=head;
        int i;
        for(i=0;i<2*n;i++)
        {
           String p=sc.next();
            temp=new Node(p);
            temp=temp.next;
        }
         Node temp2=head;
        while(temp2.next.next!=null)
        {
            temp2.next=temp2.next.next;
            temp2=temp2.next;
            
        }
         Node temp1=head;
        while(temp1!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        
    }

}