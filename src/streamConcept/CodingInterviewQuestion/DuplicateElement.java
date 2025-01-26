package streamConcept.CodingInterviewQuestion;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
//        Arrays.asList(10, 15, 8, 49, 25, 98, 32,15,10)
//                .stream()
//                .distinct()
//                .forEach(n-> System.out.println(n));
        


//        //Using HashSet to filter
//        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 15, 10, 34, 10, 15);
//        Set<Integer> set=new HashSet<>();
//
//        list.stream()
//                .filter(n-> !set.add(n))
//                .forEach(n-> System.out.println(n));



        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 6, 4, 7, 8, 9, 4);
//        List<Integer> duplicates=numbers.stream()
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(entry->entry.getValue()>1)
//                .map(entry->entry.getKey())
//                .collect(Collectors.toList());
//        System.out.println(duplicates);

        List<Integer> duplicate = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println(duplicate);


    }
}
