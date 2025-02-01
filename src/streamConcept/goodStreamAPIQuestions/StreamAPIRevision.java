package streamConcept.goodStreamAPIQuestions;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPIRevision {
    public static void main(String[] args) {
        
        
//        separateEvenAndOdd();
//          removeDuplicateElement();
//          findFrequencyofEcahCharacter();
  //        findFrequencyofEachWord();
//        sortInReverseOrder();
//        useDelimeterInString();
//        multipleOf5();
//        findMaxAndMin();
        sortOnTheBasisOfLengthString();
    }

    private static void sortOnTheBasisOfLengthString() {
       String[] arr={"Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn"};

        String[] sortedArray = Arrays.stream(arr)
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .toArray(String[]::new);

        System.out.println(Arrays.toString(sortedArray));
    }

    //    Given a list of integers, find maximum and minimum of those numbers
    private static void findMaxAndMin() {
        List<Integer> list=Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        System.out.println(list.stream().max(Comparator.naturalOrder()).get());
        System.out.println(list.stream().min(Comparator.naturalOrder()).get());
    }

    //    From the given list of integers, print the numbers which are multiples of 5
    private static void multipleOf5() {
        List<Integer> list=Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        list.stream().filter(num->num%5==0).forEach(System.out::println);
    }

    //    Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter
    private static void useDelimeterInString() {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String collect = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(collect);
    }

    //    How do you sort the given list of decimals in reverse order
    private static void sortInReverseOrder() {
        List<Integer> list=Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    //    How do you find frequency of each word in a string using Java 8 streams
    private static void findFrequencyofEachWord() {

        String str="He he he hi Kiran kiran";

        Map<String,Long> map=Arrays.stream(str.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }

    //    How do you find frequency of each character in a string using Java 8 streams
    private static void findFrequencyofEcahCharacter() {

        String inputString = "Java Concept Of The Day";
        Map<Character,Long> map=inputString.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
        System.out.println(map);
    }

    //    How do you remove duplicate elements from a list using Java 8 streams
    private static void removeDuplicateElement() {
        List<String

                > list=Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }

    //    Given a list of integers, separate odd and even numbers
    private static void separateEvenAndOdd() {

        List<Integer> list=Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> listMap = list.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(listMap);
    }
}
