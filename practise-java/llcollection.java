import java.util.*;
// Demonstrates common LinkedList operations.
public class llcollection {

    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("b");
        list.addFirst("A");
        list.addLast("D");
        list.add(2, "c");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(1));
        list.set(1, "Z");

        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        list.remove("z");
        System.out.println(list);

        System.out.println(list.contains("c"));
        System.out.println(list.indexOf("c"));
        System.out.println(list);
        list.addAll(Arrays.asList("x", "y", "q"));
        









    }
}