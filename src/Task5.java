import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Task5 {
    public static void main(String[] args) {
        Stream<Integer> firstStream = Stream.of(1, 2, 3, 4);
        Stream<Integer> secondStream = Stream.of(5, 6, 7, 8, 9);

        Stream<Integer> zippedStream = zip(firstStream, secondStream);
        zippedStream.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Iterator<T> zippedIterator = new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return firstIterator.hasNext() && secondIterator.hasNext();
            }

            @Override
            public T next() {
                T firstElement = firstIterator.next();
                T secondElement = secondIterator.next();
                return firstElement;
            }
        };

        Spliterator<T> zippedSpliterator = Spliterators.spliteratorUnknownSize(zippedIterator, 0);
        return StreamSupport.stream(zippedSpliterator, false);
    }
}
