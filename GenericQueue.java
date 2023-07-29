import java.util.ArrayList;
import java.util.NoSuchElementException;

public class GenericQueue<T> {
    private ArrayList<T> queue;
    public GenericQueue(int initialCapacity) {
        queue = new ArrayList<T>(initialCapacity);
    }
    public T front() {
        if(queue.isEmpty())
            throw new NoSuchElementException("queue is empty");
        return queue.get(0);
    }
    public void enqueue(T x) {
        queue.add(x);
    }
    public void dequeue() {
        if(queue.isEmpty())
            throw new NoSuchElementException("queue is empty");
        queue.remove(0);
    }
    public void iterateAndPrint() {
        while(!queue.isEmpty()) {
            System.out.println(front());
            dequeue();
        }
    }
}
