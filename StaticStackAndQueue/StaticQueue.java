package StaticStackAndQueue;

public class StaticQueue {
    private int[] arr;
    private int front;
    private int size;

    public StaticQueue(){
        arr=new int[5];
        front=0;
        size=0;
    }

    public StaticQueue(int size){
        arr=new int[size];
        front=0;
        size=0;
    }

    public void enqueue(int num) throws Exception{

        if(isFull()){
            throw new Exception(" Queue is already full");
        }

        int idx=(front+size)%arr.length;
        arr[idx]=num;
        size++;
    }

    public int dequeue()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is already empty");
        }

        int ele=arr[front];
        front++;
        size--;

        return ele;

    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size== arr.length;
    }

    public void display(){
     int count=0;
        for(int i=front;i< arr.length ;i++){
            System.out.print(arr[i]+" ");
            count++;
        }


            for (int i = 0; i < front && count<size; i++){
                System.out.print(arr[i] + " ");
                count++;
        }
        System.out.println();
    }

}
