package coreJava.multithreading;
import java.util.stream.IntStream;

    class ParallelTest {
//1 2 3 ......10
 //1 4 9 16      25 36 49 64   81 100
        public static void main(String[] args) throws Exception {
            int n = args.length > 0 ? Integer.parseInt(args[0]) : 3;
            long t1 = System.currentTimeMillis();
            long r = IntStream.range(1, n + 1)
                    .parallel()
                    .mapToLong(Worker::doWork)
                    .sum();
            long t2 = System.currentTimeMillis();
            System.out.printf("Result = %d, computed in %.3f sec.%n", r, (t2 - t1) / 1000.0);
        }
    }