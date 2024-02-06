import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main_PriorityQueue {

    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(1);
        pq.add(2);
        pq.add(3);

        while(pq.size()>0){
            System.out.println(pq.remove());
        }
    }
}
