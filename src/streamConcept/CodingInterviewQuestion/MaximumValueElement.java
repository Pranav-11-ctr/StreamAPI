package streamConcept.CodingInterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumValueElement {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 44, 5, 2, 56, 4, 76, 8, 79, 74);

        Integer integer = numbers.stream()
                .max((a1, a2) -> a1.compareTo(a2))
                .get();
        System.out.println(integer);
    }
}
