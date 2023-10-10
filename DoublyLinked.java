import java.util.*;
class DoublyLinked
{
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public Node head = null;


    public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
           
        }
        else
        {
            head.next = newNode;
            head = newNode.prev;
        }
    }
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
            newNode.next=head;
            head.prev = newNode;
            head = newNode;  
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;

    }

    public void insertBefore(int target,int data){
        Node newNode = new Node(data);
        if(head==null)
        {
            System.out.println("Can't add");
        }
        if(head.data == target)
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        Node current = head;
        while(current.next != null && current.next.data != target)
        {
            current =  current.next;
        }
        if(current.next == null)
        {
            System.out.println("Element not found");
        }
        newNode.next = current.next;
        current.next = newNode;
        newNode.prev = current;
    }
    public void insertAfter(int target,int data){
        Node newNode = new Node(data);
        if(head==null)
        {
            System.out.println("Can't add");
        }
        if(head.data == target)
        {
           newNode.next=head.next;
           head.next = newNode;
           newNode.prev = head;
           return;
        }
        Node current = head;
        while(current != null && current.data != target)
        {
            current =  current.next;
        }
        if(current != null)
       
        newNode.next = current.next;
        current.next = newNode;
        newNode.prev = current;
    }

     public void insertAtPosition(int position,int data)
    {
        Node newNode = new Node(data);
        if(position == 1)
        {
            newNode.next = head;
            head = newNode;
        }
        else{
            Node prev = head;
            int count = 1;
            while(count < position - 1)
            {
                prev = prev.next;
                count++;
            }
            Node current = prev.next;
            prev.next= newNode;
            newNode.next = current;
        }
    }
    public void deleteFirst(){
        if(head==null)
        System.out.println("List is empty");
        else
        {
    
           head = head.next;
           head.prev = null;
        

        }
    }
      public void deleteLast(){
        if(head==null || head.next==null)
        {
            System.out.println("Can't delete");
        }
        else{
            Node current = head;
            Node prev = null;
            while(current.next != null)
            {
                prev = current;
                current = current.next;

            }
            
            prev.next = null;
            current.prev = null;
        }

    }

    public void deleteBefore(int target) {
    if (head == null || head.next == null) {
        System.out.println("Not enough nodes to delete.");
        return;
    }

    Node current = head.next;
    while (current.next != null) {
        if (current.next.data == target) {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            return;
        }
        current = current.next;
    }

    System.out.println("Target node not found.");
}
    public void deleteAfter(int target) {
    if (head == null) {
        System.out.println("Can't delete. List is empty.");
        return;
    }

    Node current = head;
    while (current != null && current.data != target) {
        current = current.next;
    }

    if (current != null && current.next != null) {
        current.next = current.next.next;
    } else {
        System.out.println("Target node not found or no node after it.");
    }
}
public void deleteAtPosition(int position) {
    if (head == null) {
        System.out.println("List is empty. Nothing to delete.");
        return;
    }

    if (position == 1) {
        head = head.next;
    } else {
        Node prev = head;
        int count = 1;
        while (count < position - 1 && prev.next != null) {
            prev = prev.next;
            count++;
        }

        if (prev.next == null) {
            System.out.println("Position exceeds the length of the list.");
            return;
        }

        Node current = prev.next;
        prev.next = current.next;
        current = null; // Free up memory by dereferencing current node
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
            while(current!=null)
            {
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();


        }
    }
    public static void main (String args[])
    {
        DoublyLinked dll = new DoublyLinked();

        dll.addNode(5);
        dll.addFirst(7);

        dll.addLast(9);

        dll.insertBefore(5, 6);

        dll.insertAfter(9, 3);

        dll.insertAtPosition(4,1);

        dll.deleteFirst();

        dll.deleteLast();

        //dll.deleteAfter(5);

        dll.deleteBefore(5);

        //dll.deleteAtPosition(1);


        dll.display();
    }
}

