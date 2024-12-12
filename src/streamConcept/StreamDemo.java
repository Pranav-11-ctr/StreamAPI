package streamConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        int[] numbers={1,2,3};
        Arrays.stream(numbers).
                 forEach(n-> System.out.println(n));


        Stream.generate(()->Math.random())
                .limit(3)
                .forEach(n-> System.out.println(n));


        Stream.iterate(111,n->n+1).limit(10).forEach(n-> System.out.println(n));






//        Movie m1=new Movie("a",10);
//        Movie m2=new Movie("b",20);
//        Movie m3=new Movie("c",30);
//        Movie m4=new Movie("d",40);
//        Movie m5=new Movie("ae",50);
//
//        List<Movie> listOfMovie=new ArrayList<>();
//        listOfMovie.add(m1);
//        listOfMovie.add(m2);
//        listOfMovie.add(m3);
//        listOfMovie.add(m4);
//        listOfMovie.add(m5);
//
//        listOfMovie.stream()
    }
}
