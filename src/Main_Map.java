import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main_Map {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("Mumbai", 4);
        map.put("Bangalore", 1);
        map.put("New Delhi", 2);
        map.put("Pune", 2);


        Set<Map.Entry<String,Integer>> s = map.entrySet();

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            System.out.println("key set : " + iterator.next());
        }

        for(Map.Entry<String,Integer> entry : s){
            String s1 = entry.getKey();
            Integer i = entry.getValue();

            System.out.println(s1 + " " + i);
        }
    }
}
