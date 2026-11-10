package org.streams.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class CountingCollectors {

    public static void main(String[] args) {

        String str = "axbbccaadss";

        //count char frequency
        System.out.println("\ncount char frequency");
        Map<Character, Long> map = str.chars().mapToObj(c -> (char)c).collect(
                Collectors.groupingBy( Function.identity() , Collectors.counting()));

        System.out.println(map);

        //first repeated character
        System.out.println("\nFirst repeated character");
        HashSet<Character> referenceSet = new HashSet<>();
        Optional<Character> firstRepeated = str.chars().mapToObj(c -> (char)c).filter(c -> !referenceSet.add(c)).
                findFirst();
        System.out.println(firstRepeated);

        //Duplicate Elements in List
        System.out.println("\nDuplicate Elements in List");
        HashSet<Character> duplicateSet = new HashSet<>();
        List<Character> outlist =str.chars().mapToObj(c-> (char) c).
                filter(c -> !duplicateSet.add(c)).distinct().toList();
        outlist.forEach(System.out::println);

        //Partition by vowels and consonants
        System.out.println("\nPartition by vowels and consonants");
        Predicate<Character> vowConsFunction = c -> !(
                c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u'));
        str.chars().mapToObj( c -> (char) c).collect(
          Collectors.partitioningBy(vowConsFunction)
        );
    }
}
