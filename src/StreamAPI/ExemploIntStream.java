package StreamAPI;

import java.util.stream.IntStream;

public class ExemploIntStream {
    public static void main(String[] args) {
        IntStream.range(1, 6)
                .forEach(System.out::println);
    }
}
