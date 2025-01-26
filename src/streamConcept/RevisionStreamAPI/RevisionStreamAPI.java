package streamConcept.RevisionStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RevisionStreamAPI {

    public static void main(String[] args) {

//        findEvenNumbers();
//        int[] arr = {10,15,8,49,25,98,32};
//        findEvenNumbersFromArray(arr);
        
//        separateEvenAndOdd();
//        separateEvenAndOddandCount();

//        removeDuplicate();
//          countFrequencyOfEachCharacterInAString();
        countFrequencyOfEachWordInAString();


    }

    //    How do you find frequency of each word in a string using Java 8 streams?
    private static void countFrequencyOfEachWordInAString() {
        String str="He he he hi Kiran Kiran";
        Map<String, Long> frequencyOfEachWord = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(frequencyOfEachWord);
    }

    //    How do you find frequency of each character in a string using Java 8 streams?
    private static void countFrequencyOfEachCharacterInAString() {
        String str="He he he hi Kiran Kiran";
        Map<Character,Long> map=str.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy((word->word),Collectors.counting()));
        System.out.println(map);
    }

    //    How do you remove duplicate elements from a list using Java 8 streams?
    private static void removeDuplicate() {
        List<String> list=Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> distinctElement=list
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctElement);
    }

    private static void separateEvenAndOddandCount() {

        Stream<Integer> stream=Stream.of(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean,Long> map=stream.collect(Collectors.partitioningBy((num->num%2==0),Collectors.counting()));
        System.out.println(map);
    }

    //    Given a list of integers, separate odd and even numbers?
    private static void separateEvenAndOdd() {

        List<Integer> list=Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean,List<Integer>> map=list.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(map);
    }

    //    Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

    private static void findEvenNumbers() {

        List<Integer> list= Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> evenList=list.stream()
                .filter(n->n%2==0)
                .toList();
        evenList.forEach(System.out::println);
    }


    /* When numbers are given as Array int[] arr = {10,15,8,49,25,98,32}; */
    private static void findEvenNumbersFromArray(int[] arr) {
        Arrays.stream(arr)
                .filter(n->n%2==0)
                .forEach(System.out::println);
    }
}
