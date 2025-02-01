package streamConcept.goodStreamAPIQuestions;//import java.util.*;
//import java.util.stream.Collectors;
//
//public class SortMapByValue {
//    public static void main(String[] args) {
//        // Sample map
//        Map<String, Integer> map = new HashMap<>();
//        map.put("Alice", 30);
//        map.put("Bob", 25);
//        map.put("Charlie", 35);
//        map.put("David", 20);
//
//        // Sort the map by values
//        Map<String, Integer> sortedMap = map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue()) // Sort by values
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey, // Key mapper
//                        Map.Entry::getValue, // Value mapper
//                        (e1, e2) -> e1, // Merge function (in case of duplicate keys)
//                        LinkedHashMap::new // Preserve order
//                ));
//
//        // Print the sorted map
//        sortedMap.forEach((key, value) -> System.out.println(key + " -> " + value));
//    }
//}

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {
    public static void main(String[] args) {
        // Sample map
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);
        map.put("David", 20);

        // Sort the map by values
        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue()) // Sort by values
                .collect(Collectors.toMap(
                        Map.Entry::getKey, // Key mapper
                        Map.Entry::getValue, // Value mapper
                        (e1, e2) -> e1, // Merge function (in case of duplicate keys)
                        LinkedHashMap::new // Preserve order
                ));

        // Print the sorted map
        sortedMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}