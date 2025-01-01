package streamConcept.CodingInterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOutAllNumbersStartingWith1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

//        List<String> collect = list.stream()
//                .map(n -> n + "")
//                .filter(s -> s.startsWith("1")).
//                collect(Collectors.toList());
//
//        System.out.println(collect);

        int[] arr={10, 15, 8, 49, 25, 98, 32};
        Arrays.stream(arr)
                .boxed()
                .map(n->n+"")
                .filter(s->s.startsWith("1")).
                forEach(s-> System.out.println(s));


    }
}
