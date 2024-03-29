package org.example.jdk9;

import java.util.stream.Stream;

/**
 * takeWhile 方法使用一个断言作为参数，返回给定 Stream 的子集直到断言语句第一次返回 false。如果第一个值不满足断言条件，将返回一个空的 Stream。

 * dropWhile 方法和 takeWhile 作用相反的，使用一个断言作为参数，直到断言语句第一次返回 true 才返回给定 Stream 的子集。

 * ofNullable 方法可以预防 NullPointerException 异常， 可以通过检查流来避免 null 值。
 */
public class TestStream {


    public static void main(String[] args) {


        // 输出 => abc
        Stream.of("a","b","c","","e","f").takeWhile(s->!s.isEmpty())
                .forEach(System.out::print);



        // 输出 => ef
        Stream.of("a","b","c","","e","f").dropWhile(s-> !s.isEmpty())
                .forEach(System.out::print);



        // 输出 => 0
        System.out.println(Stream.ofNullable(null).count());

    }
}
