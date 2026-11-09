import java.util.PriorityQueue;
import java.util.Comparator;

// Demonstrates a maximum heap with PriorityQueue and reverse ordering.
public class Maxheap{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> mh = new PriorityQueue<>(Comparator.reverseOrder());

        mh.offer(40);
        mh.offer(10);
        mh.offer(30);
        mh.offer(20);

        while(!mh.isEmpty())
        {
            System.out.println(mh.poll()+" ");
        }
    }
}