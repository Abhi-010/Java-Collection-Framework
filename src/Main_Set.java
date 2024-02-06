import java.util.*;

public class Main_Set {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(-5);
        set.add(1);
        set.add(12);
        set.add(20);

        set.add(0);
        System.out.println("Order is not maintained in HashSet : ");
        for(Integer i : set){
            System.out.println(i);
        }

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.println("Order is maintained in LinkedHashSet");
        for(Integer i : set1){
            System.out.println(i);
        }

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        treeSet.add(10);
        treeSet.add(11);
        treeSet.add(0);
        treeSet.add(1);
        System.out.println("Tree Set :");
        for(Integer i : treeSet){
            System.out.println(i);
        }

        System.out.println("Student example : ");
        TreeSet<Student> treeSet1 = new TreeSet<>();
        treeSet1.add(new Student("Abhi",33,"abhi@gmail.com","Deoghar"));
        treeSet1.add(new Student("Mahi",39,"mahi@gmail.com","USA"));
        treeSet1.add(new Student("Chad",31,"chad@gmail.com","Bangalore"));

        for(Student s : treeSet1){
            System.out.println(s.toString());
        }

    }
}
