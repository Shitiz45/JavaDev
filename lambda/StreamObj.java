package lambda;

import java.util.stream.Stream;

public class StreamObj {
    public static void main(String[] args) {

        // empty Stream => empty() method
        Stream<Object> emptyStream = Stream.empty();

        System.out.println(emptyStream);

        // for working with arrays,collections,string etc => of() method
        String names[] = { "Shitiz", "Khushi", "Ram", "Shyam", "Mohan" };

        Stream<String> str1 = Stream.of(names);
        str1.forEach(e -> {
            System.out.println(e);
        });

        // using builder
        // Stream<Object> streamBuilder = Stream.builder().build();

    }
}
