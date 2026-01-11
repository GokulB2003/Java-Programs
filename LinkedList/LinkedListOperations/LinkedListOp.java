import java.util.*;
class LinkedList
{
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void AddFirstNode(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            return;

        }
        newNode.next=head;
        head=newNode;


    }
    public static void addLast(int data)
    {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=tail=newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;

            }
            temp.next=newNode;
            tail=newNode;
            newNode.next=null;
    }
    public static void add(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
                AddFirstNode(data);
                return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public static void addNode(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Node data");
       
        for(int i=0; i<n; i++)
        {
             int data=sc.nextInt();
            add(data);
        }

    }
    public static void addinmid(int index,int data)
    {
        Node newNode=new Node(data);
        if(index==0 || head==null)
        {
            AddFirstNode(data);
            return;
        }
        Node temp=head;
        int i=0;
        while (i<index-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public static void display()
    {
        System.out.println("the Nodes in the LinkedList:");
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    

}
public class LinkedListOp{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       LinkedList ll=new LinkedList();
      /*  ll.AddFirstNode(10);
        ll.add(40);
        ll.add(30);
       ll.addinmid(1,300);
       ll.AddFirstNode(20);
      */
        System.out.println("How much node you want to be insert:");
        int n=sc.nextInt();
        ll.addNode(n);


       ll.display();

        
    }
}