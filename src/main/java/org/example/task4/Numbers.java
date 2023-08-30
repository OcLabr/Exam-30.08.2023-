package org.example.task4;

import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(10, 12, 15, 18, 20, 21, 23, 24, 25, 30);
        integerList.stream()
                .filter(a -> a % 5 != 0 || a % 2 == 0)
                .forEach(System.out::println);
    }
}