package streamConcept.CodingInterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOutEvenNumber {
    public static void main(String[] args) {
//       List<Integer> list= Arrays.asList(10,15,8,49,25,98,32);
//       list.stream()
//               .filter(n->n%2==0)
//               .forEach(n-> System.out.println(n));


        Map<Boolean, List<Integer>> listMap = Arrays.
                stream(new int[]{10, 15, 8, 49, 25, 98, 32})
                .boxed()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));


        listMap.get(true).forEach(n-> System.out.println(n));

    }
}
