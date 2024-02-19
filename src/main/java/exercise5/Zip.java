package exercise5;

import java.util.List;
import java.util.stream.Stream;

public class Zip {
    public static void main(String[] args) {
        List<String> first = List.of("one", "two", "three");
        List<String> second = List.of("four", "five");
        Stream<String> streamString = zip(first.stream(),second.stream());

        streamString.forEach(System.out::println);

        System.out.println("-".repeat(100));

        Stream<Integer> streamInteger =
                zip(Stream.of(1,2,3,4,5,6,7),
                        Stream.of(8,9,0));
        streamInteger.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first,Stream<T> second){
        return Stream.concat(first,second);
    }
}
