import java.util.*;

public class Main_LinkedList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(3);
        ll.add(6);
        ll.add(2,5);

        Iterator iterator = ll.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        LinkedList<String>  stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Hi");
        stringLinkedList.add(null);

        iterator = stringLinkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //Vector and Stack

        List<Integer> stacInt = new Stack<>();

        Deque<Integer> stack = new ArrayDeque<Integer>();

        Deque<Integer> deque = new ArrayDeque<Integer>();

        System.out.println("deque first element " + deque.peek());
        deque.addFirst(1);
        deque.addLast(10);
        deque.addFirst(-1);
        int i = deque.getFirst();
        System.out.println(i);

        deque.push(9);
        //deque.add(null);



    }
}
