public class Queue_Circular_Array {

    // Queue implementation using circular array
    static class Queue{

        int arr[];
        int rear = -1;
        int size;
        int front = -1;

        Queue(int n){
            arr = new int[n];
            size = n;
        }

        // check if array is empty or not
        public boolean empty(){
            return rear == -1 && front ==-1;
        }

        // check if queue is full
        public boolean full(){
            return (rear+1) % size == front;
        }

        // add element to queue
        public void add(int data){
            if(full()){
                System.out.println("Queue is full");
                return;
            }

            // first element add

            if(front == -1){
                front = 0;
            }

         
            rear = (rear+1) % size;
            arr[rear] = data;
            
        }

        // remove element from queue
        public int remove(){
            if(empty()){
                System.out.println("Queue is empty");
                return -1;
            }
         
            int result = arr[front];
            //single element condition
            if(front == rear){
                front = rear = -1;
            }

            else{
                front = (front + 1) % size;
            }
 
            return result;
        
        }

        // get top element of queue
        public int top(){
            if(empty()){
                System.out.println("Queue is empty");
                return -1;
            }
         
            return arr[front];
        
        }
    }

    public static void main(String[] args) {
        System.out.println();

        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.remove());
        q.add(6);

        System.out.println(q.remove());
        q.add(7);


        while(!q.empty()){
            System.out.println(q.top());
            q.remove();
        }

        System.out.println();
    }
}