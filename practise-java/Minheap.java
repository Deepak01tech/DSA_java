import java.util.PriorityQueue;
// Demonstrates a minimum heap with Java's PriorityQueue.
public class Minheap{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        minheap.offer(40);
        minheap.offer(10);
        minheap.offer(30);

        minheap.offer(20);
        minheap.offer(60);
        minheap.offer(70);
        System.out.println("head min:"+minheap.peek());
        while(!minheap.isEmpty())
        {
            System.out.println(minheap.poll()+" ");

        }
    }
}