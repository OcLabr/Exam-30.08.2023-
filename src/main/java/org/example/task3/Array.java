package org.example.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Array {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("Burundi");
        listOfString.add("Congo");
        listOfString.add("Rwanda");
        listOfString.add("Kenya");
        listOfString.add("Tanzania");
        System.out.println(listOfString
                .stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList());
    }
}