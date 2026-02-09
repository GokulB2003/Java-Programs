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
    static int size;

    public static void AddFirstNode(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            size++;
            return;

        }
       size++;
        newNode.next=head;
        head=newNode;


    }
    public static void addLast(int data)
    {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=tail=newNode;
                size++;
                return;
            }
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;

            }
           /*  if(temp.next==null)
            {
                return;
            }
                */
            size++;
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
                size++;
                return;
        }
       
        tail.next=newNode;
        tail=newNode;
         size++;

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
        size++;

    }
    public static void removeLastNode()
    {
        Node temp=head;
        if(temp.next==null)
        {
            tail=head=null;
            size=0;
            return;

        }
     
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        tail=temp;
        size--;
        temp.next=null;
        

    }
    public static void removeNthNode(int index)
    {
        int i=1; 
        Node temp=head;
        if(size==0)
        {
            System.out.println("LinkedList is Empty:");
            return;
        }
        if(index==1)
        {
            head=head.next;
            size--;
            return;
        }
        
        while(i<index-1)
        {

            temp=temp.next;
            i++;
        }
        size--;
        //temp.next=null;
        temp.next=temp.next.next;
    }
    public static int search(int target)
    {
        int i=0;
        Node temp=head;
        while(temp!=null)
        {   
            if(temp.data==target)
            {
                return i;
            }

            i++;
            temp=temp.next;
        }
        return -1;
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
        System.out.println(size);
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
        ll.addLast(100);
        ll.addLast(200);
        ll.addLast(300);
       // ll.removeNthNode(2);
        System.out.println("Enter the value to search :");
        int target=sc.nextInt();
        int result=ll.search(target);
        if(result!=-1)
        {
            System.out.println("data found at Index "+result);

        }
        else
        {
            System.out.println("Data not found:");
        }
       ll.display();

    }
}