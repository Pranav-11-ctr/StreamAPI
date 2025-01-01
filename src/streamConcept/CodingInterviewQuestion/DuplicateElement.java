package streamConcept.CodingInterviewQuestion;

import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        Arrays.asList(10, 15, 8, 49, 25, 98, 32,15,10)
                .stream()
                .distinct()
                .forEach(n-> System.out.println(n));
    }
}
