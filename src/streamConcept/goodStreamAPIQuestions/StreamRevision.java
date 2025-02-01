package streamConcept.goodStreamAPIQuestions;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamRevision {
    public static void main(String[] args) {

//        separateEvenAndOdd();
//        removeDuplicateElement();
//        findFrequencyofEachCharacter();
//        findFrequencyofEachWord();
//        sortOnTheBasisOfLengthString();

//        filterEvenNumbers();
//        convertToUppercase();
//           sortIntegers();
//        limitAndSkip();
        flattenLists();
    }

    private static void flattenLists() {

        List<List<Integer>> list=Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(6,7));

        list.stream()
                .flatMap(List::stream)
                .toList()
                .forEach(System.out::println);

    }

    private static void limitAndSkip() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        numbers.stream()
//                .skip(2)  It will skip first 2 elements
//                .limit(5)  then make limit of 5
//                .forEach(System.out::println);

        numbers.stream()
                .limit(5)
                .skip(2)//out of 5 me pehle 2 skip krega
                .forEach(System.out::println);
    }

    private static void sortIntegers() {

        List<Integer> list=Arrays.asList(5, 3, 8, 1, 2);
        list.stream()
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    private static void convertToUppercase() {


        List<String> list=Arrays.asList("apple", "banana", "cherry");
        List<String> strList=list.stream()
                .map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(strList);

    }

    private static void filterEvenNumbers() {

        List<Integer> list=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> listEven=
                list.stream()
                .filter(num->num%2==0)
                .collect(Collectors.toList());
        System.out.println(listEven);
    }

    private static void sortOnTheBasisOfLengthString() {
        String s="Myself Pranav Kumar. Now i try to learn Java 8";

        String[] words=s.split(" ");

        Arrays.sort(words,Comparator.comparingInt(String::length));

//        System.out.println(String.join(" ",words));
        StringBuilder result=new StringBuilder();

        Arrays.stream(words).forEach(word->result.append(word).append(" "));
        System.out.println(result);


    }

    private static void findFrequencyofEachWord() {
        String s="Myself Pranav Kumar. Now i try to learn Java 8 8 Pranav i myself";

        Map<String,Long> map=Arrays.stream(s.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(word->word,Collectors.counting()));

        map.forEach((key,value)-> System.out.println(key+" "+value));

    }

    private static void findFrequencyofEachCharacter() {

        String s="Myself Pranav Kumar. Now i try to learn Java 8";
        Map<Character,Long> map=s.toLowerCase()
                .chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        map.forEach((key,value)-> System.out.println(key+" "+value));
        System.out.println(map);


    }

    private static void removeDuplicateElement() {
        List<Integer> list= Arrays.asList(71, 18, 42, 71, 71, 32, 18, 14, 42, 32);
        list.stream().distinct().forEach(System.out::println);
    }

    private static void separateEvenAndOdd() {

       List<Integer> list= Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
       Map<Boolean,List<Integer>> map= list.stream().collect(Collectors.partitioningBy(num->num%2==0));

        System.out.println("Even Number");
        map.get(true)
                .forEach(System.out::println);


    }
}
