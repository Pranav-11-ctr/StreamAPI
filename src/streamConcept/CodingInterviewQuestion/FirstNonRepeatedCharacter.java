package streamConcept.CodingInterviewQuestion;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String string="Java articles are awesome";

        string
                .toLowerCase()
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .peek(entry-> System.out.println(entry.getKey()+" "+entry.getValue()))
                .filter(entry->entry.getValue()==1)
                .findFirst()
                .ifPresent(entry-> System.out.println(entry.getKey()));

    }
}
