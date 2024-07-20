package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);

        System.out.println("This is Streams API DEMO");
        System.out.println(list1);

        // Old method without using Streams
        List<Integer> listeve = new ArrayList<>();
        for (Integer i : list1) {
            if (i % 2 == 0) {
                listeve.add(i);
            }
        }
        System.out.println(listeve);

        // Using Streams
        Stream<Integer> stream = list1.stream();
        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
    }
}
