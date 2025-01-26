package streamConcept.CodingInterviewQuestion;

import java.util.Arrays;
import java.util.List;

public class FindFirstElementInList {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 6, 4, 7, 8, 9, 4);
        numbers.stream()
                .findFirst()
                .ifPresent(n-> System.out.println(n));
    }
}
