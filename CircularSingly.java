import java.util.*;
class CircularSingly{
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
          
        
        }
    }

    public Node head = null;
    public Node tail = null;


    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if(head == null){
        head = newNode;
        tail = newNode;
        newNode.next=head;
    }

        else{
            newNode.next =head;
            tail.next = newNode;
            tail= newNode;
        }
    }
   public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null){
        head = newNode;
        tail = newNode;
        newNode.next=head;
    }
    else{
        newNode.next = head;
        head = newNode;
        tail.next = newNode;
    }
      
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else
        {
            tail.next = newNode;
            newNode.next=head;
        }
    }
    public void addBefore(int target,int data)
    {
        Node newNode = new Node(data);
        Node curr = head;
        while(curr.next != head && curr.next.data != target)
        {
            curr = curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;

    }
     public void addAfter(int target,int data)
    {
        Node newNode = new Node(data);
        Node curr = head;
        while(curr != null && curr.data != target)
        {
            curr = curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;

    }

    public void addAtPosition(int position,int data)
    {
        Node newNode = new Node(data);
        if(position == 1)
        {
            newNode.next = head;
            head = newNode;
        }
        else
        {
           Node prev = head;
           int count = 1;
           while(count < position -1) 
           {
            prev = prev.next;
            count++;
           }
           Node curr = prev.next;
           prev.next = newNode;
           newNode.next = curr;
        }
        
    }

     public void display()
    {
        Node current = head;
        if(current==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.println("Nodes of list are:");
            do
            {
                System.out.println(current.data + " ");
                current = current.next;
            }while (current != head);  
            System.out.println();


        }
    }
    
    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("Can't delete");
        }
        else{
            Node temp = head;
            while(temp.next != head)
            {
                temp=temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }
    }

    public void deleteLst()
    {
        if(head == null || head.next == head)
        {
            System.out.println("can't delete");
        }
        else{
            Node current = head;
            Node previous = null;
            while(current.next != head)
            {
                previous = current;
                current = current.next;
            }
            previous.next = head;
            tail = previous;
        }
    }
    public static void main(String[]args)
    {
        CircularSingly csl = new CircularSingly();

        csl.addNode(7);

        csl.addFirst(9);

        csl.addLast(8);

        csl.addBefore(8, 5);

        csl.addAfter(5, 2);

        csl.addAtPosition(3, 1);

        csl.deleteFirst();

        csl.deleteLst();
        
        csl.display();
    }
}