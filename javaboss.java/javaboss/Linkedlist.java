
import java.util.*;
public class Linkedlist{
    static class Node{
        int data;
        Node next;
     Node( int d)
    {
        data=d;
        next=null;
     }
}
    public static Node head;
    public static Node head1;
     public static Node newhead;
    public static void printll(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
         System.out.print("null");

    }
    public static void print1(){
        Node temp=newhead;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
         System.out.print("null");
    }

    public static void atbegin(int d)
    {
        System.out.println();
        Node newnode=new Node(d);
        Node temp=head;
        newnode.next=head;
        head=newnode;
    }
    public static void atend(int d){
        System.out.println();
        Node newnode=new Node(d);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=null;
    }
    public static void inadd(int d,int target)
    {
        if(target<0)
        System.out.println("not valid index");
        if(target==0)
        atbegin(d);
        System.out.println();
        Node newnode=new Node(d);
        Node temp=head;
        int count=0;
        while(count!=target-1){
            temp=temp.next;
            count++;
        }
        newnode.next=temp.next;
        temp.next=newnode;

    }
    public static void deleteatend()
    {System.out.println();
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

    }
     public static void deleteatbegin()
    {System.out.println();
        Node temp=head;
        head=temp.next;
    }
    public static void deleteatpos(int target)
    {
        System.out.println();
      int count=0;
      Node temp=head;
      Node c=head;
      while(count!=target-1)
      {
        count++;
        temp=temp.next;
        c=c.next;
      }
      c=c.next;
      temp.next=temp.next.next;
      c.next=null;
    }
    public static void circle()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)break;
             }
    if(fast!=null && fast.next!=null)
       {
             slow=head;
           Node prev=null;
            if(fast==slow && slow==head)
            {
                do
                {
                    prev=fast;
                    fast=fast.next;
                }while(fast!=slow);
            }
            else
            {
           while(slow!=fast)
           {
            slow=slow.next;
            prev=fast;
            fast=fast.next;
            }
            }
            prev.next=null;  
        }
    }
    public static void even()
    {
        Node slow=head;
        Node fast=null;
        Node temp=head;
        int count=0,i;
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        for(i=0;i<=count/2;i++)
        {
            fast=slow.next;
            slow.next=slow.next.next;
            fast.next=null;
            temp.next=fast;
            temp=fast;
            slow=slow.next;
            fast=slow.next;
        }
    }
    public static void addtwolist()
    {
      Node t1=head;
      Node t2=head1;
      Node nexthead=newhead;

      int carry=0;
      while(t1!=null || t2!=null)
      {
        int sum=0;
        if(t1!=null)
        {
            sum+=t1.data;
            t1=t1.next;

        }
        if(t2!=null)
        {
            sum+=t2.data;
            t2=t2.next;
        }
        sum+=carry;
        nexthead=nexthead.next;
        nexthead=new Node(sum%10);
        carry=sum/10;

      }
      if(carry!=0)
      {
        nexthead.next=new Node(carry);
      }
    }
    public static void count()
    {
        Node fast=head;
        Node slow=head;
        int count=1;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)break;
             }
             
    if(fast!=null && fast.next!=null)
    {fast=fast.next;
        while(slow!=fast)
        {
            fast=fast.next;
            count++;
        }
        System.out.println(count);
    }
}
    public static void rotate(int k)
    {
        Node temp=head;
        Node prev=null;
        int count=0;
        while(temp!=null)
        {
            prev=temp;
            temp=temp.next;
            count++;
            if(temp.next==null)
            {
                count++;
                temp.next=head;
                break;
            }
        }
        temp=head;
        prev=null;
    for(int i=0;i<count-k;i++)
    {
        prev=temp;
        temp=temp.next;
    }
    prev.next=null;
    head=temp;

        
    }
    public static void reverse()
    {
      Node curr=head;
      Node prev=null;
      Node far=null;
      while(curr!=null)
      {
        far=curr.next;
        prev=curr;
        far.next=prev;
        curr=curr.next;
}  
head=far;
    }

    
    public static void main(String args[]){
       // newhead=new Node(-1);
        
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
       head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
       //head.next.next.next.next.next=new Node(6);
        // head1=new Node(1);
        // head1.next=new Node(2);
        // head1.next.next=new Node(3);
        // head1.next.next.next=new Node(4);
        // head1.next.next.next.next=new Node(5);
        // head1.next.next.next.next.next=new Node(6);
        // head.next.next.next.next.next= head.next.next;
        //printll();
        //atbegin(9);
        //atend(60);
        //inadd(70,3);
        //deleteatbegin();
        //deleteatend();
        //deleteatpos(3);
        //printll();
       // circle();
       //even();
       //addtwolist();
       //count();
       //rotate(2);
       reverse();
        printll();
    }

}
          

