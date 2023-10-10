class StackArray
{
    int maxSize;
    int[] stackArray;
    int top;

    public StackArray()
    {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;

    }

    public int length()
    {
        return top + 1;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == maxSize - 1;
    }

    public void push(int data) {
            if (isFull()) {
                System.out.println("Stack is full. Cannot push element.");
                return;
            }

            top++;
            stackArray[top] = data;
        }


    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
        }

        int poppedElement = stackArray[top];
        top--;
        return poppedElement;
    }

    public int peek()
    {
         if (isEmpty()) {
           throw new IllegalStateException("Stack is empty. Cannot peek element.");
        }
        return stackArray[top];
    }

    public void display()
    {
        if(isEmpty())
        {
             System.out.println("Stack is empty");
        }
        System.out.print("Elements in Stack are:");
        for(int i = top;i>=0;i--)
        {
            System.out.println(stackArray[i]);
        }
    }

    public static void main(String[] args)
    {
        Stack stack =new Stack();

        stack.push(4);
        stack.push(7);
        stack.push(6);

        stack.display();

        stack.pop();

        stack.display();

        int peekelement =stack.peek();
        System.out.println(peekelement);


    }
}
 