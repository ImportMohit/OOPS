package StaticStackAndQueue;

public class StaticQueueUse {
    public static void main(String[] args) throws Exception{
        StaticQueue q=new StaticQueue();
        q.dequeue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.display();

//       System.out.println( q.dequeue()+" "+q.dequeue());
//
//        q.display();
        q.enqueue(8);
        q.enqueue(7);

        q.display();
    }
}
