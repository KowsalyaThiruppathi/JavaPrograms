public class PriorityQueueArray {
    private class PriorityData {
        int data;
        int priority;

        PriorityData(int data, int priority) {
            this.data = data;
            this.priority = priority;
        }
    }

    private PriorityData[] queue;
    private int rear;
    private int size;

    public PriorityQueueArray(int capacity) {
        queue = new PriorityData[capacity];
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return rear == queue.length - 1;
    }

   public void enqueue(int data, int priority) {
     PriorityData newData = new PriorityData(data, priority);
     if (isEmpty()) {
       
        queue[0] = newData;
        rear = 0;
        size++;
        return;
    }

    if (isFull()) {
        System.out.println("Priority queue is full");
        return;
    }

    int i;
    for (i = rear; i >= 0 && priority > queue[i].priority; i--) {
        queue[i + 1] = queue[i];
    }

    queue[i + 1] = newData;
    rear++;
    size++;
}


    public int dequeueHighestPriority() {
        if (isEmpty()) {
            System.out.println("Priority queue is empty");
            return -1; 
        }

        int removedElement = queue[0].data;
        for (int i = 0; i < rear; i++) {
            queue[i] = queue[i + 1];
        }

        rear--;
        size--;
        

        return removedElement;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Priority queue is empty");
            return;
        }

        System.out.print("Priority Queue: ");
        for (int i = 0; i <= rear; i++) {
            System.out.print(queue[i].data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueueArray pq = new PriorityQueueArray(10);

        pq.enqueue(9, 2);
        pq.enqueue(4, 1);
        pq.enqueue(67, 3);

        pq.print();

        System.out.println("Removing element "+pq.dequeueHighestPriority());
        pq.print();
    }
}
