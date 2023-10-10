import java.util.Scanner;

class DequeueArray {
    int queue[];
    int front;
    int rear;
    int size;

    public DequeueArray(int size) {
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return front == 0 && rear == size - 1;
    }

    public void insertAtRear(int data) {
        if (isFull()) {
            System.out.println("Dequeue is full. Cannot insert at rear.");
        }
         else if(front == -1)
        {
            front = rear = 0;
            queue[0] = data;
            return;
        }
            rear++;
            queue[rear] = data;
    }

    public void insertAtFront(int data) {
        if (isFull()) {
            System.out.println("Dequeue is full. Cannot insert at front.");
        }
        front ++;
        queue[front] = data;
    }

    public int deleteAtFront() {
        if (isEmpty()) {
            System.out.println("Dequeue is empty. Cannot delete from front."); 
        }
        int result = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
        return result;
    }

    public int deleteAtRear() {
        if (isEmpty()) {
            System.out.println("Dequeue is empty. Cannot delete from rear."); 
        }
        int result = queue[rear];
        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }
        return result;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Dequeue is empty.");
            return;
        }

        System.out.print("Elements in Dequeue are: ");

        int i = front;
        do {
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        } while (i != (rear + 1) % size);

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the queue:");
        int n = scan.nextInt();
        DequeueArray da = new DequeueArray(n);

        //da.insertAtFront(5);
        da.insertAtRear(3);
        //da.insertAtFront(7);
        // da.insertAtRear(9);
        // da.deleteAtFront();
        // da.deleteAtRear();

        da.display();
    }
}
