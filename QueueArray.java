import java.util.Scanner;

class QueueArray{
    int queue[];
    int front;
    int rear;
    int size;
 
    public QueueArray(int size)
    {
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
        this.size = size;
    }

    public boolean isEmpty()
    {
        return front == -1 && rear == -1;
    }

    public boolean isFull()
    {
        return rear == size - 1;
    }

    public void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear] = data;
     }
     public int dequeue()
     {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");

        }
        int result = queue[front + 1];
        front ++;
        return result;
     }
     public int peek()
     {
        if(isEmpty())
        {
             throw new IllegalStateException("Queue is Empty");

        }
        return  queue[front + 1];
     }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Elements in Queue are: ");
        for(int i = front + 1; i <= rear; i++)
        {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // Added System.in here

        System.out.println("Enter the size of the queue:");
        int n = scan.nextInt();
        QueueArray queue = new QueueArray(n);

        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(9);
        queue.dequeue();

        queue.display();
          int peekelement= queue.peek();
          

       
    }
}
