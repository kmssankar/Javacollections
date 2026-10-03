package org.streams.problems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class RecurringProblems {
    public static void main(String[] args) {
        getCharacterCountMap();
        getDuplicateElement();
        getNonRepeatElement();
        getSecondHighestNumber();
        getLongestString();
        getElementsStartsWith();

    }

    //count of  characters
    public static void getCharacterCountMap() {
        System.out.println(" \n getCharacterCountMap ");
        String input = "this is good";

        //Function.identity() -> a -> a .
        Map<String, Long> map = Arrays.stream(input.replace(" ", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }

    //find all duplicate element
    public static void getDuplicateElement() {
        System.out.println(" \n getDuplicateElement ");
        String input = "this is good";

        //Function.identity() -> a -> a .
        List<String> list = Arrays.stream(input.replace(" ", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(list);
    }

    //find first non repeat element from string
    public static void getNonRepeatElement() {
        System.out.println(" \n getNonRepeatElement ");
        String input = "this is good";

        //Function.identity() -> a -> a .
        String first = Arrays.stream(input.replace(" ", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).findFirst().get();

        System.out.println(first);
    }

    //Second highest number from a given array
    public static void getSecondHighestNumber() {
        System.out.println(" \n getSecondHighestNumber ");
        int[] numbers = {5, 9, 10, 1, 15, 17};
        int secondLargest = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).toList().getFirst();
        System.out.println(secondLargest);
    }

    //Find longest string in given array
    public static void getLongestString() {
        System.out.println(" \n getLongestString ");
        String[] input = {"this", "is", "goodz"};
        String out =  Arrays.stream(input).sorted((a,b) -> b.length() - a.length()).toList().getFirst();
        System.out.println("Using Sorting "+ out);
        //using reduce
        Arrays.stream(input).reduce((word1,word2) -> word1.length()> word2.length() ? word1: word2).ifPresent(System.out::println);
    }

    //java program to find all elements that starts with 1 and uses join for appending list
    public static void getElementsStartsWith() {
        System.out.println(" \n getElementsStartsWith ");
        Integer[] numbers = {5, 9, 10, 1, 15, 17};
        Arrays.stream(numbers).map(a -> a+"").filter( s -> s.startsWith("1")).toList()
                .forEach(System.out::println);
        String result = String.join(" - ", Arrays.asList(numbers).stream().map(a -> a+"").collect(Collectors.toList()));
        System.out.println("Join " + result);
    }
}

