import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {




//        ArrayList<String> collection1 = new ArrayList<>();
//
//        collection1.add("New York");
//        collection1.add("New Delhi");
//        collection1.add("Atlanta");
//
//        Object[] array1 = collection1.toArray();
//
//        Iterator<String> i = collection1.iterator();
//
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//
//        ListIterator<String> l = collection1.listIterator();
//
//        System.out.println(l.next());




        // Example of fail-fast iteration.

        List<String> list = new ArrayList<>();
        list.add("India");
        list.add("Nepal");
        list.add("China");

        ListIterator<String> listIterator = list.listIterator();

        while(listIterator.hasNext()) {
            String a = listIterator.next();
            listIterator.remove();
        }
        System.out.println(list.size());
        // As ArrayList is fail fast therefore above code throws exception.

//        List<String> list1 = new CopyOnWriteArrayList<>();
//        list1.add("India");
//        list1.add("Nepal");
//        list1.add("China");
//
//        ListIterator<String> listIterator = list1.listIterator();
//
//        while(listIterator.hasNext()){
//            String a = listIterator.next();
//            list1.remove(a);
//        }
//        System.out.println(list1.size());
    }
}