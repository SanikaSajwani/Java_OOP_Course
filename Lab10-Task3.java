import java.util.LinkedList;
import java.util.Queue;

interface QueueInterface {
    void enqueue(int item);
    int dequeue();
    boolean isEmpty();
}

class QueueImplementation implements QueueInterface {
    private Queue<Integer> queue;

    public QueueImplementation() {
        queue = new LinkedList<>();
    }

    public void enqueue(int item) {
        queue.add(item);
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

public class Task3 {
    public static void main(String[] args) {
        QueueInterface q = new QueueImplementation();
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue()); 
    }
}
