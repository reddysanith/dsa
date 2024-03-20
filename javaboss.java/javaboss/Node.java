
import java.util.*;
public class Datatypes{
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
    public static void printll(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
         System.out.print("null");

    }

    public static void main(String sanith){
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        printll();
    }

}
          

