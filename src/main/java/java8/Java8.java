package java8;

import java.util.Arrays;
import java.util.List;

/**
 * @Author 赵金浩
 * @Date 2019-4-9
 **/
public class Java8 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("p", "k", "u", "f", "o", "r", "k");
        Arrays.asList( "p", "k", "u","f", "o", "r","k").forEach(System.out::print);
        strings.forEach(Java8::test);
    }

    private static void test(String e) {
        System.out.print(e+2);
    }
}
