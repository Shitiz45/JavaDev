package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethods {
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

                System.out.println("Original list: " + list1);

                // Using filter() to find even numbers
                List<Integer> evenNumbers = list1.stream()
                                .filter(i -> i % 2 == 0)
                                .collect(Collectors.toList());
                System.out.println("Even numbers: " + evenNumbers);

                // Using map() to square each number
                List<Integer> squaredNumbers = list1.stream()
                                .map(i -> i * i)
                                .collect(Collectors.toList());
                System.out.println("Squared numbers: " + squaredNumbers);

                // Using count() to count even numbers
                long countEvenNumbers = list1.stream()
                                .filter(i -> i % 2 == 0)
                                .count();
                System.out.println("Count of even numbers: " + countEvenNumbers);

                // Using forEach() to print each number
                System.out.print("Original list using forEach: ");
                list1.stream()
                                .forEach(i -> System.out.print(i + " "));
                System.out.println();

                // Using min() to find the minimum number
                Optional<Integer> minNumber = list1.stream()
                                .min(Comparator.naturalOrder());
                minNumber.ifPresent(min -> System.out.println("Minimum number: " + min));

                // Using max() to find the maximum number
                Optional<Integer> maxNumber = list1.stream()
                                .max(Comparator.naturalOrder());
                maxNumber.ifPresent(max -> System.out.println("Maximum number: " + max));
        }
}
