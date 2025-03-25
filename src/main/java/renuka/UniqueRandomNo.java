package renuka;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UniqueRandomNo {

    public static void main(String[] args) {
        String s1 = "hello how are you";
        String s2 = new String("hello");
        String s3 = s2.intern();
        String s4="hello";
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s4==s3);
        System.out.println(s4==s2);
        randomNo(50);
        sixDigitRandomNum();
        int[]d={11,12};

    }

    private static void sixDigitRandomNum() {
        List<Integer> range = IntStream.range(459990, 588999).boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        Collections.shuffle(range);
        range.subList(0, 20).forEach(x-> System.out.print(x+ " "));
    }

    public static void randomNo(int max){
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        while (set.size() < 20) {
            int a = random.nextInt(max)+1;
            if (!set.contains(a)) {
                set.add(a);
            }
        }
        System.out.println(set);
    }
}