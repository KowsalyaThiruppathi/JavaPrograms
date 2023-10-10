import java.util.*;
 class Stack
{
   class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
          
        
        }
   }
   public Node top;
   public int length;

   public Stack()
   {
        top = null;
        length = 0;
   }


   public int length()
   {
        return length;
   }


   public boolean isEmpty()
   {
        return length == 0;
   }


   public void push(int data)
   {
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
   }

   public int pop()
   {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        
            int result = top.data;
            top=top.next;
            length--;
            
        return result;
   }

   public int peek()
   {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        return top.data;
   }

    public void display()
    {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }



   public static void main(String[] args)
   {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Elements in the stack:");

        stack.display();

        System.out.println("Length of Stack:" + stack.length());

        

        System.out.println("Last Element in Stack:" + stack.peek());

    }
}

        



