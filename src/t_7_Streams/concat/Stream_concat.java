package t_7_Streams.concat;

import java.util.stream.Stream;

public class Stream_concat {
    public static void main(String[] args) {

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream3 = Stream.of(6,7,8,9,10);
        Stream<Integer> stream4 = Stream.concat(stream2, stream3);
        stream4.forEach(System.out::println);
        /** Нельзя после него вызвать другой Intermediate метод */
    }
}
