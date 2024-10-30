package com.github.kadehar.inno.lesson4.fizzbuzz;

import java.util.stream.IntStream;

public class AdvancedFizzBuzz {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .mapToObj(i ->
                    i % 3 == 0 ?
                            (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                            (i % 5 == 0 ? "Buzz" : i)
                ).forEach(System.out::println);
    }
}
