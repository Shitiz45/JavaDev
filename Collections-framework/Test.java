import java.util.*;

public class Test {

    public static void main(String[] args) {

        System.out.println("Collections framework");
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(3);
        array.add(4);
        array.add(5);

        System.out.println(array);
        System.out.println(array.get(3));
        System.out.println(array.contains(3));
        System.out.println(array.contains(7));

        array.remove(3);
        System.out.println(array);

        for (int i : array) {
            System.out.println("array element " + i);
        }
        Iterator<Integer> itr = array.iterator();
        while (itr.hasNext()) {
            int ele = itr.next();
            System.out.println(ele);
        }
        // array.remove(array);

        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(5);
        hs.add(8);

        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs);
    }
}