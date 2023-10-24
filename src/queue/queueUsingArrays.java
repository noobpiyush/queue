package queue;

public class queueUsingArrays {
    int size;
   private int arr[];
    private int front;
    private int rear;

    public queueUsingArrays(int size){
        this.size = size;
        arr = new int[size];
        rear = front = -1;
    }

    public boolean isEmpty(){
       return front == -1;
    }

    public  boolean isFull(){
        return  rear == size -1;
    }

    int pop(){
        if (isEmpty()){
            return -1;
        }
        int temp = arr[front];
        if (front == rear){
            rear  = front = -1;
        }
        front++;
        return temp;
    }

    public boolean push(int data){
        if (isFull()){
            System.out.print("Cannot add queue is full");
            return false;
        }
        if (isEmpty()){
            front  = 0;
        }
        rear++;
        arr[rear] = data;
        return true;
    }

    int peek(){
        if (isEmpty()){
            return -1;
        }
        return arr[front];

    }

    public void printQueue(){
        if (isEmpty()){
            return;
        }
        for(int i = front;i<=rear;i++){
            System.out.print(arr[i] + " ") ;
        }
        System.out.println();
    }


}
