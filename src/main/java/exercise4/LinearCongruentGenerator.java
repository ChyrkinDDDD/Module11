package exercise4;

import java.util.stream.Stream;

public class LinearCongruentGenerator {
    public static void main(String[] args) {
        long a = 25214903917l;
        long c = 11l;
        long m = (long)Math.pow(2,48);

        Stream<Long> result = generateRandomNumber(0,a,c,m);
        result.forEach(System.out::println);
        //result.limit(50).forEach(System.out::println);

    }

    public static Stream<Long> generateRandomNumber(long seed, long a, long c, long m){
        return Stream.iterate(seed, x-> (a * x + c) % m);
    }
}
