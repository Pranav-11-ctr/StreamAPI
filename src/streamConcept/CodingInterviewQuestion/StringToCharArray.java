package streamConcept.CodingInterviewQuestion;

import java.util.stream.Stream;

public class StringToCharArray {
    public static void main(String[] args) {

        String string="Java articles are awesome";
        string
                .chars()
                .mapToObj(c -> (char) c);
    }
}
