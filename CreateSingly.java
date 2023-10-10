import java.util.*;
class CreateSingly{
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
          
        
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
            head = newNode;
        }
    }
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
            newNode.next=head;
            head=newNode;
        
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next=newNode;

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
    
            Node temp = head;
            head =  head.next;
            temp.next = null;
        

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
        }

    }
    public void deleteBefore(int target) {
    if (head == null || head.next == null) {
        System.out.println("Not enough nodes to delete.");
        return;
    }

    if (head.next.data == target) {
        head = head.next;
        return;
    }

    Node current = head;
    while (current.next != null && current.next.next != null) {
        if (current.next.next.data == target) {
            current.next = current.next.next;
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

    if (current != null ) {
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
        while (count < position - 1) {
            prev = prev.next;
            count++;
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
    public void searchNode(int target)
    {
        Node current = head;
        int i = 1;
        boolean flag = false;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            while(current != null)
            {
                if(current.data == target)
                {
                    flag = true;
                    break;
                }
                i++; 
                current = current.next;
            }
        }
        if(flag)
        System.out.println("Element found at poition" + i);
        else
        System.out.println("Element not found" );
    }
    public static void main (String args[])
    {
        CreateSingly sll = new CreateSingly();

        sll.addFirst(13);
        //sll.addFirst(7);

        sll.addLast(8);

        sll.insertBefore(8, 5);

        //sll.insertAfter(7, 4);

        //sll.insertAtPosition(1, 2);

        //sll.deleteFirst();

        //sll.deleteLast();

       // sll.deleteBefore(13);

        //sll.deleteAfter(5);

       sll.deleteAtPosition(2);
       sll.searchNode(8);
       
        sll.display();
    }
}